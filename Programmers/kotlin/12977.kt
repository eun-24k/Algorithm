class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        var set : MutableList<Int> = mutableListOf()
 
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        println("Hello Kotlin")
        for (i in 0 until nums.size - 2 ) {
            for (j in (i+1) until nums.size - 1) {
                for (k in (j+1) until nums.size) {
                    set.add(nums[i] + nums[j] + nums[k])
                }
            }
        }
        println(set)
        
        set.forEach {
            when (isPrimeNumber(it)) {
                true -> answer += 1
            }
        }
        return answer
    }
    
    fun isPrimeNumber(num: Int): Boolean {
        for (i in 2 until num) {
            when {
                (num%i == 0) -> return false
            }
        }
        return true
    }
}
