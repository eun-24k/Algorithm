class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var sum: Long = 0
        for (i in 0 until count) {
            sum += price*(i+1)
        }
        if (sum-money >= 0) {
            answer = (sum-money).toLong()
        } else {
            answer = 0
        }
        return answer
    }
}
