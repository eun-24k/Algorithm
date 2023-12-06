class Solution {
    fun solution(s: String): IntArray {
        val prevIndexMap = hashMapOf<Char, Int>()
        return s.mapIndexed { index, c ->
            val prevIndex = prevIndexMap[c]
            prevIndexMap[c] = index
            if (prevIndex == null) -1 else index - prevIndex
        }.toIntArray()
    }
}
