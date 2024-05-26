// 런타임 에러가 떴는데 그 문제는 for문을 while문으로 수정함으로써 해결하였다 그렇지 만 답이 틀렸다고 자꾸 떠시 지금 스트레스를 받고 있다.


// 결국에는 다 풀었다

//답 :
class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var numer = numer1*denom2+numer2*denom1
        var denom = denom1*denom2
        var gcf = getGCF(numer,denom)
        println("$numer, $denom, $gcf")
        return intArrayOf(numer/gcf, denom/gcf)
    }
    
    
    fun getGCF(n : Int, m : Int) : Int {
        var gcm = 1
        var min : Int
        var max : Int
        when {
            (n == m) -> return n
            (n < m) -> {
                min = n
                max = m
            }
            else -> {
                min = m
                max = n
            }
        }
        var i = 2
        while (i <= min) {
            when {
                (min%i == 0 && max%i == 0) -> {
                    gcm *= i
                    min /= i
                    max /= i
                }
                else -> {
                    i += 1
                }
            }
        }
        return gcm
    }
}

/**


Test 1 〉	통과 (0.20ms, 61.5MB)
Test 2 〉	통과 (0.01ms, 62.2MB)
Test 3 〉	통과 (0.02ms, 60.7MB)
Test 4 〉	통과 (0.01ms, 62.2MB)
Test 5 〉	실패 (0.01ms, 62.5MB)
Test 6 〉	실패 (0.01ms, 62.2MB)
Test 7 〉	통과 (0.06ms, 61.7MB)
Test 8 〉	통과 (0.03ms, 59.8MB)
Test 9 〉	통과 (0.46ms, 62.2MB)
Test 10 〉	통과 (1.16ms, 62.5MB)
Test 11 〉	통과 (0.01ms, 62.1MB)
Test 12 〉	통과 (0.01ms, 64.6MB)
Test 13 〉	실패 (0.02ms, 62.4MB)
Test 14 〉	통과 (0.08ms, 62MB)
Test 15 〉	통과 (0.07ms, 62.2MB)
**/
class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        
        // 더하는 로직
        var numer = numer1*denom2 + numer2*denom1
        var denom = denom1*denom2
        var answer: IntArray 
        var i = 1
        if (numer >= denom) {
            while (i < denom) {
                if (numer%i == 0 && denom%i == 0) {
                    numer = numer/i
                    denom = denom/i
                }
                i += 1
            }
            answer = intArrayOf(numer, denom)
    
        } else {
            while (i < numer) {
                if (numer%i == 0 && denom%i == 0) {
                    numer /= i
                    denom /= i
                }
                i += 1
            }
            answer = intArrayOf(numer, denom)
        }
        
        
        
        return answer
    }
}