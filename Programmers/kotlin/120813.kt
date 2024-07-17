class Solution {
    fun solution(n: Int): ArrayList<Int> {
        var answer: ArrayList<Int> = arrayListOf()
        var size = (n+1)/2
        for (i in 0 until size) {
            answer.add(i*2 + 1)
        }
        
        return answer
    }
}