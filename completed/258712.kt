class Solution {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        var answer: Int = 0
        
        // 변수 선언
        
        // 주고 받은 선물과 선물 지수를 표로 나타낸 
        val record = Array(friends.size) { Array<Int>(friends.size) {0} }
        // 준 선물 | 받은 선물 | 선물 지수
        val index = Array(friends.size) {Array<Int>(3) {0} }
        // 다음 달에 받을 선물 개수
        val present = Array<Int>(friends.size) { 0 }
        
        for (i in gifts.indices) {
            var array = gifts[i].split(" ")
            record[friends.indexOf(array[0])][friends.indexOf(array[1])] += 1
            
            index[friends.indexOf(array[0])][0] += 1
            index[friends.indexOf(array[1])][1] += 1
        }
        
        for (i in friends.indices) {
            index[i][2] = index[i][0] - index[i][1]
        }
        println(index.contentDeepToString())
        
        for (give in friends.indices) {
            
            for (take in (give + 1) until friends.size) {
                
                when {
                    (record[take][give] > record[give][take]) -> present[take] += 1
                    (record[take][give] < record[give][take]) -> present[give] += 1
                    (record[take][give] == record[give][take]) -> {
                        // compare 선물 지수
                        when {
                            (index[give][2] > index[take][2]) -> present[give] += 1
                            (index[give][2] < index[take][2]) -> present[take] += 1
                            (index[give][2] == index[take][2]) -> Unit

                            
                        }
                    }
                }
            }
        }
        
        println(present.joinToString())
        
        answer = present.sortedDescending()[0]
        
        return answer
    }
}