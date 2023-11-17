fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    var String = "*".repeat(a)
    for (i in 0 until b) {
        println(String)
    }
}
