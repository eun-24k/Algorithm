class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var a = 0
        var b = 0

        for (array in sizes) {
            array.sort()
            if (array.isNotEmpty()) {
                a = array.first().coerceAtLeast(a)
                b = array.last().coerceAtLeast(b)
            }
        }
        return a * b
    }
}
