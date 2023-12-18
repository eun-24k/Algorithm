class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = "e"
        var month = arrayOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30)
        var m = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")
        var days = 0
        for (i in 0 until a) {
            days += month[i]
        }
        days += b
        when (days%7) {
            1 -> answer = m[4]
            2 -> answer = m[5]
            3 -> answer = m[6]
            4 -> answer = m[0]
            5 -> answer = m[1]
            6 -> answer = m[2]
            0 -> answer = m[3]
        }
        return answer
    }
}
