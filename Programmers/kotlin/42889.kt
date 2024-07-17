class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var players = stages.size
        var stage = stages.sorted().toList().groupingBy{ it }.eachCount()
        var map : MutableMap<Int, Double> = mutableMapOf()
        var index = 1
        for (i in 1 .. N) {
            var frequency = stage.filter { it.key == i }.toList()
            when (frequency.size) {
                0 -> map.put(i, 0.0)
                else -> {
                    map.put(i, frequency[0].second.toDouble()/players)
                    players -= frequency[0].second
                }
            }
        }

        return map.toList().sortedByDescending{ it.second }.toMap().keys.toIntArray()
    }
}