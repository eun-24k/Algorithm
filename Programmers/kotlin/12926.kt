class Solution {
    fun solution(s: String, n: Int): String {
        var answer = 0
        var sChar = s.toCharArray()
        for (i in s.indices) {
            var sInt = sChar[i].toInt()
            println(sInt)
            if (sInt == 32) {
                continue
            } else if (sInt < 91) {
                sInt += n
                if (sInt > 90) {
                    sInt -= 26
                }
            } else if (sInt > 96) {
                sInt += n
                if (sInt > 122) {
                    sInt -= 26
                }
            }
            sChar.set(i, sInt.toChar())
        }
        
        return sChar.joinToString("")
    }
}
