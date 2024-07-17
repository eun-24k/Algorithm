import kotlin.math.*

class Solution {
    fun solution(X: String, Y: String): String {
        var pairs : MutableMap<Char, Int> = mutableMapOf()
        var answer: String = ""
        var x1 = X.toCharArray().toList().groupingBy{ it }.eachCount()
        var y1 = Y.toCharArray().toList().groupingBy{ it }.eachCount()
        var x = x1
        var y = y1
        if (x1.size > y1.size) {
            x = y1
            y = x1
        }
        
        x.forEach { itx ->
            var key = y.filter { ity ->
                itx.key == ity.key }
            if (key.keys.size == 1) {
                pairs += when {
                    (itx.value > key.values.first()) -> mapOf(itx.key to key.values.first())
                    (itx.value < key.values.first()) -> mapOf(itx.key to itx.value)
                    else -> mapOf(itx.key to itx.value)
                }
            }
        }
        
        if (pairs.size == 0) {
            answer = "-1"
        } else if (pairs.size == 1 && pairs.keys.first() == '0')  {
            answer = "0"
        } else {
            pairs.toSortedMap().forEach {
                answer = (it.key.toString()).repeat(it.value) + answer
            }
        }
        
        return answer
    }
}