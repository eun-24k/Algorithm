class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val row = arr1.size
        var listOfLists = mutableListOf<IntArray>()
        var listInside = mutableListOf<Int>()
        for (i in 0 until row) {
            var column = arr1[i].size
            for (j in 0 until column) {
                listInside.add(arr1[i][j] + arr2[i][j])
            }
            listOfLists.add(listInside.toIntArray())
            listInside.clear()
        }
        return listOfLists.toTypedArray()
    }
}
