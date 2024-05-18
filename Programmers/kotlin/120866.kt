class Solution {
    fun solution(board: Array<IntArray>): Int {
        var danger = getDanger(board)
        println(danger.contentDeepToString())
        
        return getSafeZone(danger)
    }
    
    fun getSafeZone(area : Array<Array<Int>>) : Int {
        var answer = 0
        for (i in area.indices) {
            for (j in area[0].indices) {
                if (area[i][j] == 0) {
                    answer += 1
                }
            }
        }
        return answer
    }
    
    fun getDanger(board: Array<IntArray>): Array<Array<Int>> {
        var column = board[0].size - 1
        var row = board.size - 1
        val b = board
        var danger = Array(column+1) {Array<Int>(row+1) {0} }
        for (i in 0..row) {
            for (j in 0..column) {
                println(b.contentDeepToString())

                if (b[i][j] == 1) {
                    danger[i][j] = 1
                    
                    println("$i, $j")
                        when {
                            (i == 0 && j == 0) -> {
                                danger[i+1][j] = 2
                                danger[i][j+1] = 2
                                danger[i+1][j+1] = 2
                            }
                            (i == 0 && j == column) -> {
                                danger[i+1][j] = 2
                                danger[i][j-1] = 2
                                danger[i+1][j-1] = 2
                            }
                            (i == row && j == 0) -> {
                                danger[i-1][j] = 2
                                danger[i][j+1] = 2
                                danger[i-1][j+1] = 2
                            }
                            (i == row && j == column) -> {
                                danger[i-1][j] = 2
                                danger[i][j-1] = 2
                                danger[i-1][j-1] = 2
                            }
                            (i == 0 && j != 0 && j != column) -> {
                                danger[i][j+1] = 2
                                danger[i][j-1] = 2
                                danger[i+1][j+1] = 2
                                danger[i+1][j-1] = 2
                                danger[i+1][j] = 2
                            }
                            (i == row && j != 0 && j != column) -> {
                                danger[i][j+1] = 2
                                danger[i][j-1] = 2
                                danger[i-1][j+1] = 2
                                danger[i-1][j-1] = 2
                                danger[i-1][j] = 2
                            }
                            (j == 0 && i != 0 && i != row) -> {
                                danger[i-1][j] = 2
                                danger[i+1][j] = 2
                                danger[i-1][j+1] = 2
                                danger[i+1][j+1] = 2
                                danger[i][j+1] = 2
                            }
                            (j == column && i != 0 && i != row) -> {
                                danger[i-1][j] = 2
                                danger[i+1][j] = 2
                                danger[i-1][j-1] = 2
                                danger[i+1][j-1] = 2
                                danger[i][j-1] = 2
                            }   
                            (i != 0 && i != row && j != 0 && j != column) -> {
                                danger[i][j+1] = 2
                                danger[i][j-1] = 2
                                danger[i+1][j+1] = 2
                                danger[i+1][j-1] = 2
                                danger[i-1][j+1] = 2
                                danger[i-1][j-1] = 2
                                danger[i+1][j] = 2
                                danger[i-1][j] = 2
                            }
                            else -> Unit
                        }
                
                }


            }
        }
        return danger
    }
}