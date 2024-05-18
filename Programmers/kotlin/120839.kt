class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        rsp.forEach{
            when (it) {
                '0' -> answer += '5'
                '2' -> answer += '0'
                '5' -> answer += '2'
            }
        }
        return answer
    }
}