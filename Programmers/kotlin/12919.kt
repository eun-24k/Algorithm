class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        val elementToFind = "Kim"
        val index = seoul.indexOf(elementToFind)
        
        return "김서방은 ${index}에 있다"
    }
}
