import kotlin.math.*

class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 1
        var numbers : ArrayList<Map<Int, Int>> = arrayListOf()
        
        arr.forEach { it ->
            var multiples : ArrayList<Int> = arrayListOf()
            var n = it
            var i = 2
            while (i<=n) {
                when (n%i) {
                    0 -> {
                        n = (n.toDouble()/i).toInt()
                        multiples.add(i)
                    }
                    else -> {
                        i += 1
                    }
                }
            }
            numbers.add(multiples.toList().groupingBy{ it }.eachCount())
        }
        
        var lcm : MutableMap<Int, Int> = mutableMapOf()
        
        println("numbers $numbers")
        numbers.forEach { it1 ->
            it1.keys.forEach { it2 ->
                var m = lcm.filter{it -> it.key == it2}
                
                when (m.size) {
                    1 -> {
                        when {
                            (it1.get(it2)!! > lcm.get(it2)!!) -> lcm.put(it2, it1.get(it2)!!)
                            else -> Unit
                        }
                    }
                    else -> lcm.put(it2, it1.get(it2)!!)
                }
            }
        }
        println("lcm $lcm")
        lcm.forEach{
            answer *= ((it.key).toDouble().pow(it.value)).toInt()
        }
        
        return answer
    }
}