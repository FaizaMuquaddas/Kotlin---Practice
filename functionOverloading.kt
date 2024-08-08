// Functions and Function overloading with example
class XPattern {
    fun xPattern(n: Int) {
        var size = n
        for (i in 0 until size) {
            // 0
            // 1
            // 2
            // 3
            // 4
            for (j in 0 until size) {
                // 0
                print(if (i == j || i + j == size - 1) "*" else " ")
                // 0==0 || 0+0 == 5-1
                // 0==1 || 0+1 == 5-1
                // 0==2 || 0+2 == 5-1
                // 0==3 || 0+3 == 5-1
                // 0==4 || 0+4 == 5-1

                // 1==0 || 1+0 == 5-1
                // 1==1 || 1+1 == 5-1
                // 1==2 || 1+2 == 5-1
                // 1==3 || 1+3 == 5-1
                // 1==4 || 1+4 == 5-1

                // 2==0 || 2+0 == 5-1
                // 2==1 || 2+1 == 5-1
                // 2==2 || 2+2 == 5-1
                // 2==3 || 2+3 == 5-1
                // 2==4 || 2+4 == 5-1

                // 3==0 || 3+0 == 5-1
                // 3==1 || 3+1 == 5-1
                // 3==2 || 3+2 == 5-1
                // 3==3 || 3+3 == 5-1
                // 3==4 || 3+4 == 5-1

                // 4==0 || 4+0 == 5-1
                // 4==1 || 4+1 == 5-1
                // 4==2 || 4+2 == 5-1
                // 4==3 || 4+3 == 5-1
                // 4==4 || 4+4 == 5-1

                // *   *
                //  * *
                //   *
                //  * *
                // *   *
            }
            println()
        }
    }
}

fun main() {
    var XPattern = XPattern()
    var result = XPattern.xPattern(5)
    println(result)
}

// Function overloading examples:

// 1.
// same name but no arguments
// fun xPattern(){
//     println("Hi")
// }

// 2.
// same name but diffrent datatype
// fun xPattern(n: String){
//     println("Hi")
// }

// 3.
// same name with no. of arguments 2
// fun xPattern(n: Int, b: String){
//     println("Hi")
// }

// 4.
// same name with no. of arguments 2 having diffrent data type from the previous example no. 3
// fun xPattern(n: String, b: String, ){
//     println("Hi")
// }