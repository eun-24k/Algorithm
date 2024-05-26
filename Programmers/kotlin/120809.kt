class Solution {
    fun solution(numbers: IntArray): ArrayList<Int> {
        var answer: ArrayList<Int> = arrayListOf()
        numbers.forEach { answer.add(it*2) }
        return answer
    }
}