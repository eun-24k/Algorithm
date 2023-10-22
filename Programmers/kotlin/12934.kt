import kotlin.math.sqrt
import kotlin.math.pow
class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        val x = sqrt(n.toDouble()).toLong()
        
        return if (x * x == n) (x+1)*(x+1) else -1
    }
}
