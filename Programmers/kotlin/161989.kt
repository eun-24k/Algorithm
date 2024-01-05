import java.util.LinkedList

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        val queue = LinkedList<Int>()
        var answer = 0
        section.toCollection(queue)
        var currentPoint = Int.MIN_VALUE

        while (queue.isNotEmpty()) {
            val node = queue.poll()
            if (currentPoint + m - 1 < node) {
                answer++
                currentPoint = node
            }
        }

        return answer
    }
}
