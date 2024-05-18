class Solution {
    fun solution(array: IntArray): Int {
        var a = array.sorted()
        return a[a.size/2]
    }
}