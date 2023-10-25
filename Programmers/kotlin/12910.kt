class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        var intList = mutableListOf<Int>()
        for (i in 0 until arr.size) {
            if (arr[i] % divisor == 0) {
                intList.add(arr[i])
            }
        }
        if (intList.size == 0) {
            intList.add(-1)
        }
        return intList.sorted().toIntArray()
    }
}
