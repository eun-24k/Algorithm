import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var ternary = toTernary(n)
        return toDecimal(ternary)
    }
    
    fun toTernary(n : Int): ArrayList<Int> {
        var x = n
        var ternary : ArrayList<Int> = arrayListOf()
        while (x >= 3) {
            
            ternary.add(0, x%3)
            x = x/3
        }
        ternary.add(0, x)
        
        return ternary
    }
    
    fun toDecimal(ternary: ArrayList<Int>): Int {
        var answer = 0.0
        ternary.toIntArray().forEachIndexed { i, s ->
            answer += (3.0.pow(i.toDouble()))*(s.toDouble())
        }
        return answer.toInt()
    }
}
