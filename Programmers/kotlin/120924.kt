class Solution {
    fun solution(common: IntArray): Int {
        var n0 = common[0]
        var n1 = common[1]
        var n2 = common[2]
        return when {
            (2*n1 == n0+n2) -> common[common.size-1] + n1 - n0
            (n1*n1 == n0*n2) -> common[common.size-1]*n1/n0
            else -> 0
        }
    }
}