class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var bottleNumber: Int = n
        var remainder: Int = 0
        while (bottleNumber>=a) {            
            answer += (bottleNumber/a)*b
            remainder = (bottleNumber%a)
            bottleNumber = (bottleNumber/a)*b + remainder
        }
        return answer
    }
}
