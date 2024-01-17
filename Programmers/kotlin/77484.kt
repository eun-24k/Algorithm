class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var fixed_wins:Int = 0
        var max_wins:Int = 0
        for (i in lottos.indices) {
            if (lottos[i] == 0) {
                max_wins += 1
            } else {
                for (j in win_nums.indices) {
                    if (lottos[i] == win_nums[j]) {
                        fixed_wins += 1
                    }
                }
            }
            
            
        }
        
        return intArrayOf(prizeTier(fixed_wins+max_wins), prizeTier(fixed_wins))
    }
    
    fun prizeTier(wins: Int):Int {
        return when(wins) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}
