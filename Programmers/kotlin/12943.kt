class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var n = num
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2
                answer += 1
            } else {
                n = 3*n + 1
                answer +=1
            }
        }
        
        if (n != 1) {
            answer = -1
        }

        return answer
    }
}
