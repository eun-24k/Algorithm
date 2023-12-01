class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        var list = mutableListOf<Int>()
        for (l in 0 until commands.size) {
            var i = commands[l][0]-1
            var j = commands[l][1]-1
            var k = commands[l][2]-1
            for (m in i .. j) {
                list.add(array[m])
            }
            list.sort()
            answer.add(list[k])
            list.clear()
        }
        return answer.toIntArray()
    }
}
