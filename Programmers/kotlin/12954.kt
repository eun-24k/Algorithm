class Solution {
    fun solution(x: Int, n: Int): Array<Int> {
        var answer = intArrayOf()
        val list: MutableList<Int> = answer.toMutableList()
        for (i in 1..n) {
            list.add(x*i)
        }
        
        return list.toTypedArray()
        
    }
}
