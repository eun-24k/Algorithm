// FINAL Solution

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
        board.mapIndexed { i, it1 ->
            it1.mapIndexed { j, it2 ->
                if (it2 == 1) {
                    danger[i][j] = 1
                    try {
                        danger[i][j+1] = 2
                    } catch (e:ArrayIndexOutOfBoundsException) {}
                    try {
                        danger[i][j-1] = 2
                    } catch (e:ArrayIndexOutOfBoundsException) {}
                    try {
                        danger[i+1][j+1] = 2
                    } catch (e:ArrayIndexOutOfBoundsException) {}
                    try {
                        danger[i+1][j] = 2
                    } catch (e:ArrayIndexOutOfBoundsException) {}
                    try {
                        danger[i+1][j-1] = 2
                    } catch (e:ArrayIndexOutOfBoundsException) {}
                    try {
                        danger[i-1][j+1] = 2
                    } catch (e:ArrayIndexOutOfBoundsException) {}
                    try {
                        danger[i-1][j] = 2
                    } catch (e:ArrayIndexOutOfBoundsException) {}
                    try {
                        danger[i-1][j-1] = 2
                    } catch (e:ArrayIndexOutOfBoundsException) {}

                }
                
            }
            
        }

        return danger
    }
}

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



/// for문에서 mapIndexed로 바꾸어 실행함. (그래도 런타임 에러는 그대로읻 ㅏㅜㅜㅠㅠ)

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
        board.mapIndexed { i, it1 ->
            it1.mapIndexed { j, it2 ->
                if (it2 == 1) {
                    danger[i][j] = 1

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



/**
for 문 사용 (element으로 0을 가지고 있는 값의 개수를 찾을 떄에도 for문 사용)
Test 1 〉	통과 (26.68ms, 64MB)
Test 2 〉	통과 (17.73ms, 63.4MB)
Test 3 〉	통과 (26.42ms, 64.2MB)
Test 4 〉	통과 (33.71ms, 64.1MB)
Test 5 〉	통과 (26.01ms, 64.1MB)
Test 6 〉	통과 (30.40ms, 65.4MB)
Test 7 〉	통과 (31.39ms, 65.9MB)
Test 8 〉	통과 (16.88ms, 63.6MB)
Test 9 〉	실패 (런타임 에러)
Test 10 〉	통과 (16.13ms, 64MB)
Test 11 〉	통과 (26.20ms, 64.4MB)
Test 12 〉	통과 (29.30ms, 65MB)
Test 13 〉	통과 (26.45ms, 64.4MB)
Test 14 〉	통과 (30.07ms, 63.9MB)

for 문 사용 (element으로 0을 가지고 있는 값의 개수를 찾을 떄에는 groupBy, CountEach() 사용함. 테스트 뒤로 갈 수록 런타임이 줄어드는 걸 확인할 수 있다.)
Test 1 〉	통과 (30.50ms, 64.1MB)
Test 2 〉	통과 (17.64ms, 64.7MB)
Test 3 〉	통과 (29.92ms, 64.2MB)
Test 4 〉	통과 (27.24ms, 64.7MB)
Test 5 〉	통과 (32.05ms, 64.2MB)
Test 6 〉	통과 (36.25ms, 66.2MB)
Test 7 〉	통과 (30.97ms, 64.5MB)
Test 8 〉	통과 (16.87ms, 63.6MB)
Test 9 〉	실패 (런타임 에러)
Test 10 〉	통과 (22.09ms, 64.9MB)
Test 11 〉	통과 (41.50ms, 64.4MB)
Test 12 〉	통과 (31.71ms, 64.7MB)
Test 13 〉	통과 (42.60ms, 64.3MB)
Test 14 〉	통과 (39.98ms, 64.6MB)

for문에서 mapIndexed로 바꿈. 확실히 시간이 단축이 되었지만 테스트 9 도대체 왜 런타임 에러인거니이...
Test 1 〉	통과 (16.45ms, 63.8MB)
Test 2 〉	통과 (21.08ms, 64MB)
Test 3 〉	통과 (16.81ms, 63.7MB)
Test 4 〉	통과 (18.00ms, 67.3MB)
Test 5 〉	통과 (19.30ms, 63.6MB)
Test 6 〉	통과 (25.83ms, 63.8MB)
Test 7 〉	통과 (17.04ms, 65.3MB)
Test 8 〉	통과 (20.88ms, 63.6MB)
Test 9 〉	실패 (런타임 에러)
Test 10 〉	통과 (23.82ms, 63.6MB)
Test 11 〉	통과 (24.68ms, 63.5MB)
Test 12 〉	통과 (20.42ms, 63.7MB)
Test 13 〉	통과 (16.43ms, 63.5MB)
Test 14 〉	통과 (19.32ms, 64.3MB)

if문을 try catch문으로 바꾸어봄.
Test 1 〉	통과 (16.67ms, 64MB)
Test 2 〉	통과 (24.87ms, 63.8MB)
Test 3 〉	통과 (16.66ms, 64.8MB)
Test 4 〉	통과 (15.67ms, 64.1MB)
Test 5 〉	통과 (22.81ms, 64.7MB)
Test 6 〉	통과 (22.01ms, 64.5MB)
Test 7 〉	통과 (24.12ms, 64MB)
Test 8 〉	통과 (25.35ms, 64.5MB)
Test 9 〉	통과 (22.19ms, 64.4MB)
Test 10 〉	통과 (19.03ms, 63.9MB)
Test 11 〉	통과 (25.94ms, 63.9MB)
Test 12 〉	통과 (17.44ms, 64.2MB)
Test 13 〉	통과 (22.11ms, 63.3MB)
Test 14 〉	통과 (21.74ms, 64.1MB)
**/