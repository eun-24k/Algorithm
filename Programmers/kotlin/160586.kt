class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): ArrayList<Int> {
        var keyMap : MutableMap<Char, Int> = getKeyMap(keymap)
        
        
        return getResult(getKeyMap(keymap), targets)
    }
    
    fun getResult(keyMap : MutableMap<Char, Int>, targets : Array<String>) : ArrayList<Int> {
        var answer: ArrayList<Int> = arrayListOf()
        targets.forEach { it1 ->
            var n = 0
            var m = 0
            it1.forEach { it2 ->
                when (keyMap.containsKey(it2)) {
                    true -> n += keyMap.get(it2)!! + 1
                    else -> m = -1
                }
            }
            when (m) {
                -1 -> answer.add(-1)
                else -> answer.add(n)
            }
            
        }
        return answer
    }
    
    fun getKeyMap(keymap: Array<String>) : MutableMap<Char, Int> {
        var key : MutableMap<Char, Int> = mutableMapOf()
        keymap.forEach { keys ->
            keys.forEachIndexed { index, char ->
                when (key.containsKey(char)) {
                    true -> {
                        if (key.get(char)!! > index) {
                            key.put(char, index)
                        }
                    }
                    else -> key.put(char, index)
                }
                
            }
            
        }
        return key
    }
}