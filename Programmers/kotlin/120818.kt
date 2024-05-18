class Solution {
    fun solution(price: Int): Int {
        return when {
            (price >= 500000) -> (price*(0.8)/1).toInt()
            (price >= 300000) -> (price*(0.9)/1).toInt()
            (price >= 100000) -> (price*(0.95)/1).toInt()
            else -> price
        }
    }
}