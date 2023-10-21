class Solution {
    fun solution(n: Long): Array<Int> {
        var answer = intArrayOf()
        val list: MutableList<Int> = answer.toMutableList()
        var nString = n.toString()
        var nCharArray = nString.toCharArray()
        var arraySize = nCharArray.size
        for (i in 0 until arraySize) {
            list.add(nCharArray[arraySize-1-i].digitToInt())
        }
        return list.toTypedArray()
    }
}
