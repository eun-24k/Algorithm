class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer = ""

        var map : MutableMap<Char, Int> = mutableMapOf('R' to 0, 'T' to 0, 'C' to 0, 'F' to 0, 'J' to 0, 'M' to 0, 'A' to 0, 'N' to 0)
        survey.forEachIndexed { index, it ->
            var a = it.toCharArray()[0]
            var b = it.toCharArray()[1]
            try{
                    when (choices[index]) {
                    1 -> map.put(it.toCharArray()[0], map.get(it.toCharArray()[0])!!+3)
                    2 -> map.put(it.toCharArray()[0], map.get(it.toCharArray()[0])!!+2)
                    3 -> map.put(it.toCharArray()[0], map.get(it.toCharArray()[0])!!+1)
                    4 -> Unit
                    5 -> map.put(b, map.get(b)!!+1)
                    6 -> map.put(b, map.get(b)!!+2)
                    7 -> map.put(b, map.get(b)!!+3)
                    else -> Unit
                }
            } catch (e: NullPointerException) {

            }

        }
        println(map)

        answer += when (map.get('R')!! >= map.get('T')!!) {
            true -> "R"
            else -> "T"
        }
        answer += when (map.get('C')!! >= map.get('F')!!) {
            true -> "C"
            else -> "F"
        }
        answer += when (map.get('J')!! >= map.get('M')!!) {
            true -> "J"
            else -> "M"
        }
        answer += when (map.get('A')!! >= map.get('N')!!) {
            true -> "A"
            else -> "N"
        }



        return answer
    }
}