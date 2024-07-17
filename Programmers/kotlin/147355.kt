// 내가 직접 풀어따 :))))

import kotlin.math.*
class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var tSize = t.toCharArray().size
        var pSize = p.toCharArray().size
        for (i in 0 until (tSize-pSize+1)) {
            for (j in 0 until pSize) {
                if (t[i+j] > p[j]) {
                    break
                } else if (t[i+j] == p[j]) {
                    if (j == pSize-1) {
                        answer += 1
                    }
                } else {
                    answer += 1
                    break
                }
                
            }
            
        }
        return answer
    }
}


// 전에 찾았었던 티스토리 답변 

class Solution {
    fun solution(t: String, p: String): Int = (0..t.length - p.length).map {
        t.substring(it until it + p.length).toLong()
    }.count {
        it <= p.toLong()
    }
    
}
출처: https://dev-musa.tistory.com/entry/알고리즘-Level1-크기가-작은-부분문자열 [Fun한 개발자 dev_stitch:티스토리]
