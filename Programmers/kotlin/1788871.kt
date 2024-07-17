class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var answer: Array<String> = players
        
        for (i in callings.indices) {
            val index = players.indexOf(callings[i])
            val overtaken = players[index-1]
            answer[index-1] = callings[i]
            answer[index] = overtaken
        }

        
        return answer
    }
}

// solution I found

class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var nameToRank: MutableMap<String, Int> = hashMapOf()
        players.forEachIndexed { index, player -> nameToRank[player] = index }
        callings.forEach {
            player -> var findIndex = nameToRank[player]!!
            var switchedPlayer = players[findIndex - 1]

            //원래 배열 자리바꾸기
            players[findIndex] = switchedPlayer
            players[findIndex - 1] = player

            //Map update
            nameToRank[player] = nameToRank[player]!! - 1
            nameToRank[switchedPlayer] = nameToRank[switchedPlayer]!! + 1
        }
        return players
    }
}