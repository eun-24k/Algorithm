class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        var point = hp
        answer += point/5
        point = point%5
        answer += point/3
        point = point%3
        answer += point
        return answer
    }
}