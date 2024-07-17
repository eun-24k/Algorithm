class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {   
        var _reserve = reserve.toCollection(ArrayList())
        var _lost = lost.toCollection(ArrayList())
        var students = n
        lost.forEach { it ->
            var overlap = _reserve.filter{it2 -> it2 == it}
            when (overlap.size == 0) {
                false -> {
                    _reserve.remove(overlap[0])
                    _lost.remove(overlap[0])  
                }
                else -> Unit
            }
                      
        }
        _lost.sorted().forEach { it1 ->
            
            var borrow = _reserve.filter{it2 -> (it2 == it1 + 1) || (it2 == it1 - 1)}.sorted()
            println(borrow.size)
            when (borrow.size) {
                0 -> students = students - 1
                else -> _reserve.remove(borrow[0])
            }
        }
        println(students)
        return students
    }
}