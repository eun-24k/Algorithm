class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        for (i in 1 until food.size) {
            for (j in 0 until food[i]/2) {
                answer += i
            }
        }
        answer += 0
        for (i in food.size-1 downTo 1) {
            for (j in 0 until food[i]/2) {
                answer += i
            }
        }
        
        return answer
    }
}
