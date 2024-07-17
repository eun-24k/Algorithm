class Solution {
    fun solution(n: Int): Int {
        var answer : Long = 0
        var N : Long = 0
        var M : Long = 1
        var L : Long = 1
        for (i in 2..n) {
            L = N + M
            answer = N + M
            N = M % 1234567
            M = L % 1234567
        }
        return (M.toFloat() % 1234567).toInt()
    }
}