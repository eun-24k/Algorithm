import kotlin.math.*
class Solution {
    fun solution(brown: Int, yellow: Int): ArrayList<Int> {
        var sum = brown.toDouble()/2 + 2.0
        var product = (yellow+brown).toDouble()
        var a = sum.toDouble()/2
        var b = sqrt(sum.pow(2)-4*product)/2
        
        return arrayListOf((a+b).toInt(),(a-b).toInt())
    }
}