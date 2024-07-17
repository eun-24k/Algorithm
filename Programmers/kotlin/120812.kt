class Solution {
    fun solution(array: IntArray): Int {
        val mode = array.sorted().toList().groupingBy{ it }.eachCount()
        val max = mode.values.sorted().toList().groupingBy{ it }.eachCount()
        
        return when (max.values.last()) {
            1 -> mode.maxByOrNull{ it.value ?: 0 }!!.key
            else -> -1
        }
    }
}