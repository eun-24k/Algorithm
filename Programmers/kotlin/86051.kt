class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1
        var nonAnswer = mutableListOf<Int>()
        for (i in 0..9) {
            for (j in 0 until numbers.size) {
                if(numbers[j] == i)
                nonAnswer.add(numbers[j])
            }
        }
        return 45 - nonAnswer.sum()
    }
}
