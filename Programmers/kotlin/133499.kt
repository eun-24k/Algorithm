class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = babbling.size
        babbling.forEach {
            println(it)
            var i = 0
            var pair : Pair<Int,Char> = Pair(0,'z')  
            while (i < it.toCharArray().size) {                
                try {
                    if (it[i] == pair.second) {
                        pair = Pair(-1, pair.second)
                        println(pair.second)
                    } else {
                        pair = when (it[i]) {
                            'a' -> checkAYA(it[i+1], it[i+2])
                            'y' -> checkYE(it[i+1])
                            'w' -> checkWOO(it[i+1], it[i+2])
                            'm' -> checkMA(it[i+1])
                            else -> Pair(-1,'z')                       
                        }
                    }
                } catch (e: IndexOutOfBoundsException) {
                    pair = Pair(-1, pair.second)
                }
                when (pair.first) {
                    -1 -> {
                        answer -= 1
                        break
                    }
                    else -> {
                        i += pair.first
                        println("i $i")
                    }
                }
            }
        }
        return answer
    }
    
    fun checkAYA(n: Char, m: Char) : Pair<Int,Char> = if (n=='y'&&m=='a') Pair(3,'a') else Pair(-1,'a')
    fun checkYE(n: Char) : Pair<Int,Char> = if (n=='e') Pair(2,'y') else Pair(-1,'y')
    fun checkWOO(n: Char, m: Char) : Pair<Int,Char> = if (n=='o'&&m=='o') Pair(3,'w') else Pair(-1,'w')
    fun checkMA(n: Char) : Pair<Int,Char> = if (n=='a') Pair(2,'m') else Pair(-1,'m')
}