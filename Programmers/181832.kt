class Solution {
    fun solution(n: Int): Array<Array<Int>> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        
        var ans = Array(n) {Array<Int>(n) {0} }
        var pattern = arrayOf(arrayOf(0, 1), arrayOf(1,0), arrayOf(0,-1), arrayOf(-1,0))
        var multiple = getMultiple(n)
        
        var number = 1
        
        var n = 0
        var m = 0
        
        ans[0][0] = 1
        
        for (i in multiple.indices) {
            when (i%4) {
                0 -> {
                    for (j in 1..multiple[i]) {
                        m += 1
                        number += 1
                        ans[n][m] = number
                    }
                }
                1 -> {
                    for (j in 1..multiple[i]) {
                        n += 1
                        number += 1
                        ans[n][m] = number
                    }
                }
                2 -> {
                    for (j in 1..multiple[i]) {
                        m -= 1
                        number += 1
                        ans[n][m] = number
                    }
                }
                3 -> {
                    for (j in 1..multiple[i]) {
                        n -= 1
                        number += 1
                        ans[n][m] = number
                    }
                }
                    
                
            }
        }
        
        
        return ans
    }
    
    fun getMultiple(n: Int): ArrayList<Int> {
        var multiple : ArrayList<Int> = arrayListOf(n-1)
        for (i in n-1 downTo 1) {
            multiple.add(i)
            multiple.add(i)
        }
        println(multiple)
        return multiple
    }
}