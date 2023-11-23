class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        for (i1 in number.indices)
            for (i2 in i1 + 1 until number.size)
                for(i3 in i2 + 1 until number.size)
                    if (number[i1] + number[i2] + number[i3] == 0) {
                        answer++
                    }
        return answer
    }
}
