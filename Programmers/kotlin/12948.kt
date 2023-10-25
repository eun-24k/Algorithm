class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        var chars: MutableList<Char> = phone_number.toMutableList()
        for (i in 0 until chars.size-4) {
            answer += '*'
        }
        for (i in chars.size-4 until chars.size) {
            answer += chars[i]
        }
        return answer
    }
}
