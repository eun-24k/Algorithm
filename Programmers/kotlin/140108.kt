class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var word = s
        var alphabet = s[0]
        var r1 = 0
        var r2 = 0
        s.forEachIndexed { index, it ->
            when {
                (alphabet == it) -> r1 += 1
                else -> r2 += 1
            }
            if (r1 == r2 && index != word.toCharArray().size-1) {
                
                alphabet = word[index+1]
                answer += 1
                r1 = 0
                r2 = 0
            }
        }
        return answer + 1
    }
}