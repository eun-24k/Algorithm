class Solution {
    fun solution(s: String): String {
        var answer = ""
        var sArray = s.toCharArray()
        val sSize = sArray.size
        var sList = mutableListOf<Char>()
        if (sSize % 2 == 0) {
            sList.add(sArray[(sSize/2 - 1)])
            sList.add(sArray[sSize/2])
        } else {
            sList.add(sArray[(sSize-1)/2])
        }
        return sList.toString().replace("[", "").replace("]", "").replace(", ", "")
    }
}
