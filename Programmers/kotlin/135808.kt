class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer : Int = 0
        score.sortDescending()
        for (i in 0 until score.size/m) {
            answer += score[(i+1)*m-1]*m
        }
        return answer
    }
}
