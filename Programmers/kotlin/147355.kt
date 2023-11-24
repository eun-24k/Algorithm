class Solution {
    fun solution(t: String, p: String): Int = (0..t.length - p.length).map {
        t.substring(it until it + p.length).toLong()
    }.count {
        it <= p.toLong()
    }
    
}
출처: https://dev-musa.tistory.com/entry/알고리즘-Level1-크기가-작은-부분문자열 [Fun한 개발자 dev_stitch:티스토리]
