import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var dice = arrayListOf(a,b,c,d).sorted()
        var diceElements = dice.distinct()
        println(dice)
        
        println(diceElements)
        var answer: Int = 0
        return when (diceElements.size){ 
            1 -> 1111*a
            2 -> twoElements(dice, diceElements)
            3 -> threeElements(dice, diceElements)
            4 -> diceElements[0]
            else -> 0
        }

    }
    
    fun threeElements(dice : List<Int>, diceElements : List<Int>) : Int {
        return when {
            (dice[0] == dice[1]) -> dice[2] * dice[3]
            (dice[1] == dice[2]) -> dice[0] * dice[3]
            (dice[2] == dice[3]) -> dice[0] * dice[1]
            else -> 0
        }
        
    }
    fun twoElements(dice : List<Int>, diceElements : List<Int>) : Int {
        var x = 0
        var y = 0
        var d1 = diceElements[0]
        var d2 = diceElements[1]
        dice.forEach {
            when (it) {
                (diceElements[0]) -> x += 1
                (diceElements[1]) -> y += 1
            }
        }
        return when {
            (x == 2 && y == 2) -> (d1+d2)*abs(d1-d2)
            (x == 3 && y == 1) -> (10*d1+d2)*(10*d1+d2)
            (x == 1 && y == 3) -> (10*d2+d1)*(10*d2+d1)
            else -> 0
        }
        
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// v2 조금 더 정리해서 문제 풀이 해봄.

import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var dice = arrayListOf(a,b,c,d).sorted()
        var diceElements = dice.distinct()
        println(dice)
        
        println(diceElements)
        var answer: Int = 0
        return when (diceElements.size){ 
            1 -> 1111*a
            2 -> twoElements(dice, diceElements)
            3 -> threeElements(dice, diceElements)
            4 -> diceElements[0]
            else -> 0
        }

    }
    
    fun threeElements(dice : List<Int>, diceElements : List<Int>) : Int {
        return when {
            (dice[0] == dice[1]) -> dice[2] * dice[3]
            (dice[1] == dice[2]) -> dice[0] * dice[3]
            (dice[2] == dice[3]) -> dice[0] * dice[1]
            else -> 0
        }
        
    }
    fun twoElements(dice : List<Int>, diceElements : List<Int>) : Int {
        var d1 = diceElements[0]
        var d2 = diceElements[1]
        return when {
            (dice[1] != dice[2]) -> (d1+d2)*abs(d1-d2)
            (dice[0] == dice[1]) -> (10*d1+d2)*(10*d1+d2)
            (dice[0] != dice[1]) -> (10*d2+d1)*(10*d2+d1)
            else -> 0
        }
        
    }
}