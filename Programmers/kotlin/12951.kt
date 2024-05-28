class Solution {
    fun solution(s: String): String {
        var sArray = arrayListOf<String>()
        s.split(' ').forEach{
            var start = ""
            var word = it.removeRange(0, 1)
            start = when {
                (97 <= it[0].toInt() && it[0].toInt() <= 122) -> (it[0]-32)
                else -> it[0]
            }.toString()
            var capital = word.toCharArray().filter { (65 <= it.toInt() && it.toInt() <= 90) }
            capital?.forEach { word = word.replace(it,it+32) }
            
            sArray.add(start + word)
        }
        return sArray.joinToString(" ")
    }
}