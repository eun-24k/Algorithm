class Solution {
    fun solution(quiz: Array<String>): ArrayList<String> {
        var result : ArrayList<String> = arrayListOf()
        quiz.forEach {
            var question = it.split(" ").toTypedArray()
            var answer = when (question[1]) {
                "-" -> question[0].toInt() - question[2].toInt()
                "+" -> question[0].toInt() + question[2].toInt()
                "*" -> question[0].toInt() * question[2].toInt()
                "/" -> (question[0].toDouble()/(question[2].toDouble())).toInt()
                else -> 0
            }
            when (answer.toString()) {
                question[4] -> result.add("O")
                else -> result.add("X")
            }
        }
        return result
    }
}