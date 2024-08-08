fun main() {
    val size = 21 // Adjust the size as needed

    for (i in 0 until size) {
        // 0
        // 1
        // 2
        for (j in 0 until size - i - 1) {       
            // 0 in 0 until 3-0 -1
            // 0 in 1 until 3-0 -1
            
            // 0 in 0 until 3-1-1 

            // 0 in 0 until 3-2-1
            print(" ")
        }
        for (k in 0..i) {
            // 0 in 0..0
            
            // 0 in 0..1
            // 1 in 0..1

            // 0 in 0..2
            // 1 in 0..2
            // 2 in 0..2
            print("*")
            if (k < i) {
                // 0 < 0

                // 0 < 1
                // 1 < 1

                // 0 < 2
                // 1 < 2
                //  2< 2
                print(" ")
            }
        }
        println()
    }
}

            
//  *  
// * *
//* * *

//    *
//   * *
//  * * *
// * * * *
//* * * * *