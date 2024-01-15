import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for (i in 1..number) {
            var nLCD = countLCD(i)
             when  {
                (nLCD > limit) -> answer += power
                else -> answer += nLCD
            }
        }
        
        return answer 
    }
    
    fun countLCD(number: Int): Int {
        var count = 0
        if (number == 1) {
            count += 1
        } else {
            count += 2
            for (i in 2 .. sqrt(number.toDouble()).toInt()) {
                if (number%i == 0)  {
                    when {
                        (i*i == number) -> count += 1
                        else -> count += 2
                    }
                }
            }
        }
        return count 
    }
}
