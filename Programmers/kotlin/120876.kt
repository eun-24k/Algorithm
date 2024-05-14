class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var answer: Int = 0
        var linePlots : ArrayList<ArrayList<Int>> = arrayListOf()
        for (i in lines.indices) {
            var line : ArrayList<Int> = arrayListOf()
            for (j in lines[i][0].. lines[i][1]) {
                line.add(j)
            }
            linePlots.add(line)
        }

        // AB : intersecting length between line 1 and 2
        // BC : intersecting length between line 2 and 3
        // AC : intersecting length between line 1 and 3
        // ABC : intersecting length between line 1, 2 and 3

        var AB = getLength(linePlots[0], linePlots[1])
        var BC = getLength(linePlots[2], linePlots[1])
        var AC = getLength(linePlots[0], linePlots[2])
        var commonAB = linePlots[0].intersect(linePlots[1]).toCollection(ArrayList())
        var ABC = getLength(commonAB, linePlots[2])


        // Therefore, the total distance that intersects at least once would be the sum of all intersections between 1,2 / 2,3  and 1,3 respectively the subtracts the common length between the three twice as it should have already been added 3 times.
        
        return (AB+BC+AC-2*ABC)
    }
    
    fun getLength(x : ArrayList<Int>, y : ArrayList<Int>): Int {
        var commonPlots = x.intersect(y)
        return when (commonPlots.size) {
            0 -> 0
            1 -> 0
            else -> commonPlots.size - 1
        }
    }
}