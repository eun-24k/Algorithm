class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        array.forEach {
            if (it > height) {
                answer += 1
            }
        }
        return answer
    }
}