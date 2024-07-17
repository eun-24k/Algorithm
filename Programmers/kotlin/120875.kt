class Solution {
    fun solution(dots: Array<IntArray>): Int {
        
        getGradient(dots[0], dots[1])
        var answer: Int = 0
        
        var case1 = getGradient(dots[0], dots[1]) == getGradient(dots[2], dots[3])
        var case2 = getGradient(dots[0], dots[2]) == getGradient(dots[1], dots[3])
        var case3 = getGradient(dots[0], dots[3]) == getGradient(dots[1], dots[2])
        if (case1 || case2 || case3) {
            answer = 1
        }

        return answer
    }
    
    fun getGradient(plot1 : IntArray, plot2 : IntArray) : Double {
        var xIncrement = (plot1[0] - plot2[0]).toDouble()
        var yIncrement = (plot1[1] - plot2[1]).toDouble()
        return yIncrement/xIncrement
    }
}