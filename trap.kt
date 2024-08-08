fun trapeziumPattern(num: Int) {
    var firstHalf = 1
    var secondHalf = (num * num) + 1
    var numOfSpaces = 0

    // numOfLines is the line number
    for (numOfLines in num downTo 1) {

        // Prints the spaces for each line
        repeat(numOfSpaces) {
            print(" ")
        }

        // Prints the first half of the trapezium
        for (firstHalfCounter in 1..numOfLines) {
            // If it is the last number for a line then
            // we don't print '*'
            if (firstHalfCounter == numOfLines) {
                print("${firstHalf++}")
            } else {
                print("${firstHalf++} ")
            }
        }

        // Prints the second half of the trapezium
        for (secondHalfCounter in 1..numOfLines) {
            print("  ${secondHalf++}")
        }

        println()

        // Calculates the number of Spaces for the next
        // line
        numOfSpaces += 2

        // Calculates the first number of the
        // second half for the next iteration/line
        secondHalf = (secondHalf - 1) - ((numOfLines - 1) * 2)
    }
}

fun main() {
    trapeziumPattern(4)
}
