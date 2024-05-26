import kotlin.math.*

class Solution {
    fun solution(s: String): String {
        var answer = ""
        var array = s.split(" ")
        var arr : ArrayList<Int> = arrayListOf()
        array.forEach {
            if (it[0] == '-') {
                var num : Int = 0
                for (i in 1 until it.toCharArray().size) {
                    num += -it[it.toCharArray().size - i].digitToInt()*(10.0.pow(i-1)).toInt()
                }
                arr.add(num)

            } else {
                var num : Int = 0
                for (i in it.indices) {
                    num += it[it.toCharArray().size - 1 - i].digitToInt()*(10.0.pow(i)).toInt()
                }
                arr.add(num)
            }
        }
        println(arr.sorted())
        return "${arr.sorted().first()} ${arr.sorted().last()}"
    }
}