// you are given two number a and n. find a^n. time complexity must not exceed O(log n)

fun main() {
    var a = 2
    val n = 5
    var i = n
    val result: Long

    result = pow(n, a, i)
    println("$n = $result")
}

fun pow(n: Int, a: Int, i: Int): Long {
    return if (i == 0) n.toLong() else a * pow(a, a, i-1)
}
