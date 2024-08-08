fun main() {
    val size = 21 // Adjust the size as needed
    var star = "*"
    for (i in 0 until size) {
        // 0 
        // 1
        var j = ((size - 1) - i)
        //  (7-1)-0
        // 5
        while (j > 0) {
            // 6>0
            // 5
            print(" ")
            j--

            // 5
            // 4
        }
        println("$star")
        star += " *"

        // * *
        //* * *
        //  
}
}

//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
// * * * * * *
//* * * * * * *