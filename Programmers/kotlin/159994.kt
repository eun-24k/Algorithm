class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = ""
        var n = 0
        var m = 0
        for (i in goal.indices) {
            if (goal[i] == cards1[n]) {
                if (n<cards1.size-1) {
                    n += 1
                } else {
                    n = 0
                }
                
            } else if (goal[i] == cards2[m]) {
                if (m<cards2.size-1) {
                    m += 1
                } else {
                    m = 0
                }
            } else {
                return "No"
            }
        }
        return "Yes"
    }
}
