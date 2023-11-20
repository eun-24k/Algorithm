class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf(gcd(maxOf(n, m), minOf(n, m)), n*m/gcd(maxOf(n, m), minOf(n, m)))
        return answer
    }
    
    fun gcd(a: Int, b: Int): Int = if(b != 0) gcd(b, a % b) else a
}
