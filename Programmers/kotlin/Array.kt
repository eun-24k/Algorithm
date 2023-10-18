class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        for(index in 0 until numbers.size){
            answer += numbers[index]
        }
        answer = answer/numbers.size
        return answer
    }
}
