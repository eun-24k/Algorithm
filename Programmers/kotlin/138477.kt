class Solution {
    fun solution(k: Int, score: IntArray): IntArray {        
        var list = mutableListOf<Int>()
        var answer = mutableListOf<Int>()
        for (i in score.indices) {
            list.add(score[i])
            list.sort()
            if (i<k-1) {
                answer.add(list[0])
            } else {
                answer.add(list[i-k+1])
            }
        }
        return answer.toIntArray()
    }
}
