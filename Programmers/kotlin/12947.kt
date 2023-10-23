class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum = 0
        var xCharArray = x.toString().toCharArray()
        var arraySize = xCharArray.size
        var xIntArray = IntArray(arraySize)
        for (i in 0 until arraySize) {
            xIntArray[i] = xCharArray[i].digitToInt()
            sum += xIntArray[i]
        }
        if (x % sum == 0) {
            answer = true
        } else {
            answer = false
        }
        return answer
    }
}
