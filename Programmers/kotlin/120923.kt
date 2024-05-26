class Solution {
    fun solution(num: Int, total: Int): ArrayList<Int> {
        var n = total/num - (num - 1)/2
        println(n)
        var answer: ArrayList<Int> = arrayListOf()
        for (i in n until n+num) {
            answer.add(n)
            n += 1
        }
        return answer
    }
}