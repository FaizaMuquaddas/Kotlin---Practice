fun main() {
    val size = 10 // Adjust the size as needed
    var star = "*"
    var k = 1
    var space = " "
    for (i in 0 until size) {
        var j = ((size - 1) - i)

        while (j > 0) {
            // print(j)

            print(" ")
            j--
        }
        if (i == size - 1) {
            star = "* "
            print("${star.repeat(size)}")
        } else {
            println("$star")
        }
        // else{
        star = "*${space.repeat(k)}*"
        // }
      k += 2
}
}