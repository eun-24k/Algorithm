class Solution {
    fun solution(s: String): Int {
        val nums = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven","eight", "nine")
        var str = s
        for (i in 0 until nums.size) {
            str = str.replace(nums[i], i.toString())
        }
        return str.toInt()
    }
}
