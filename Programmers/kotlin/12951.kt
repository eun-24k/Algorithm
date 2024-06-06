class Solution {
    fun solution(s: String): String {
        var answer = ""
        s.split(' ').forEachIndexed{ index1, it1 ->
            it1.forEachIndexed { index2, it2 ->
                answer += when (index2) {
                    0 -> toCapital(it2)
                    else -> toSmallCase(it2)
                }
            }
            answer += when (index1) {
                (s.split(' ').size - 1) -> ""
                else -> " "
            }
            
        }
        return answer
    }
    fun toCapital(s : Char) : String {
        return when (s.toInt() >=97 && s.toInt() <= 122) {
            true -> (s - (97-65)).toString()
            else -> s.toString()
        }
    }
    fun toSmallCase(s : Char) : String {
        return when (s.toInt() >=65 && s.toInt() <= 95) {
            true -> (s + (97-65)).toString()
            else -> s.toString()
        }
    }
}