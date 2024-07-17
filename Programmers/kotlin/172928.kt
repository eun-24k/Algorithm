class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        
        var plot : IntArray = intArrayOf()
        
        var map : ArrayList<ArrayList<Int>> = arrayListOf()
        for (i in park.indices) {
            var row : ArrayList<Int> = arrayListOf()
            for (j in park[i].toCharArray().indices) {
                when (park[i].toCharArray()[j]) {
                    'S' -> {
                        plot = intArrayOf(i, j)
                        row.add(0)
                    }
                    'O' -> row.add(0)
                    else -> row.add(1)
                }
            }
            map.add(row)
        }
        println("plot : ${plot.joinToString()}")
        println("map : $map")
        
        for (i in routes.indices) {
            var blocked = false
            var direction : IntArray = when (routes[i][0]) {
                'E' -> intArrayOf(0, 1)
                'S' -> intArrayOf(1, 0)
                'W' -> intArrayOf(0, -1)
                'N' -> intArrayOf(-1, 0)
                else -> intArrayOf(0, 0)
            }
            var newPlot : IntArray = plot
            println("magnitude ${routes[i][2].digitToInt()}")
            for (j in  1..routes[i][2].digitToInt()) {
                newPlot = (0 until direction.size).map { newPlot[it] + direction[it] }.toIntArray()
                println(newPlot.joinToString())
                try {
                    if (map[newPlot[0]][newPlot[1]] == 1) {
                        blocked = true
                    } 
                } catch (e : IndexOutOfBoundsException) {
                    blocked = true
                }
            }
            if (blocked) newPlot = plot else plot = newPlot
        }
        
        
        return plot
    }
}