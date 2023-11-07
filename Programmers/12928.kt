class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        var sString = s.toString()
        var sSize = sString.toCharArray().size
        if (sSize != 4 && sSize != 6) {
            answer = false
        } else {
            for (i in 0 until sSize) {
                var sInt = sString[i].toInt()
                if (sInt <= 57 && sInt >= 48) {
                    answer = true
                } else {
                    answer = false
                    break
                }
            
            }
        }

        return answer
    }
}
