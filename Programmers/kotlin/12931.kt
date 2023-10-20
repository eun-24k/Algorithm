class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var nString = n.toString()               // 1. 숫자를 문자열로 바꾼다.
        var nCharArray = nString.toCharArray()   // 2. 문자열을 CharArray로 바꾸어준다.
        var arraySize = nCharArray.size          // array size를 찾아준다.
        for (i in 0 until arraySize) {           // 4. for loop 사용해서 모든 자리수를 더해준다
            answer += nCharArray[i].digitToInt() // .digitToInt()를 사용해서 모든 자리수를 정수형으로 변환시켜준다.
        }
        return answer
    }
}
