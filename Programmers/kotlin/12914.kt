class Solution {
    fun solution(n: Int): Long {
        var dp : ArrayList<Long> = arrayListOf(0, 1, 2)
        for (i in 3.. n) {
            dp.add((dp[i-1] + dp[i-2]) % 1234567)
        }
        return dp[n]
    }
}