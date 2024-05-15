class Solution {
    fun solution(num_list: IntArray): ArrayList<Int> {
        var answer: ArrayList<Int> = arrayListOf()
        num_list.forEach{
            answer.add(0, it)
        }
        return answer
    }
}