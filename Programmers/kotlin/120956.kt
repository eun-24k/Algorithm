// https://school.programmers.co.kr/learn/courses/30/lessons/120956?language=kotlin

class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        var babbles = getAllPosibilities()
        
        for (i in babbling.indices) {
            if (babbling[i] in babbles) {
                answer += 1
            }
        }
        return answer
    }
    
    fun getAllPosibilities(): Set<String> {
        var words = arrayOf("aya", "ye", "woo", "ma")
        var allPosibilities = mutableSetOf<String>()
        for (i in words.indices) {
            allPosibilities += words[i]
            for (j in words.indices) {
                if (i != j) {
                    allPosibilities += words[i]+words[j]
                }
                for (k in words.indices) {
                    if (i!=j && j!=k) {
                        allPosibilities += words[i] + words[j] + words[k]
                    }
                    for (l in words.indices) {
                        if (i!=j && j!=k && k!=l) {
                            allPosibilities += words[i] + words[j] + words[k] +words[l]
                        }
                    }
                }
            }
        }
        return allPosibilities
    }
}