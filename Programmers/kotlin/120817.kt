class Solution {
    fun solution(arr: IntArray): Double {
        var answer: Double = 0.0
        for (i in 0 until arr.size){
            answer += arr[i]
        }
        answer = answer/arr.size
        return answer
    }
}
