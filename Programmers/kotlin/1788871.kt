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