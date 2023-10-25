class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 123456789
        var aList = mutableListOf<Int>()
        for (i in 0 until absolutes.size) {
            if (signs[i] == true) {
                aList.add(absolutes[i])
            } else {
                aList.add(-absolutes[i])
            }
        }
        return aList.sum()
    }
}
