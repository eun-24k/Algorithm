class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var small : ArrayList<Char> = arrayListOf()
        var answer: String = ""
        
        for (i in 0 until 26) {
            var x = skip.filter {it -> it == 'a'+i}
            when {
                (x.toCharArray().size != 1) -> small.add('a'+i)
                else -> Unit
            }
        }
        small += small + small

        s.forEach { it1 ->
            var firstIndex = small.indexOfFirst({it == it1})
            answer += small[index+firstIndex]
        }

        return answer
    }

}