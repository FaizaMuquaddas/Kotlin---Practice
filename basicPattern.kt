// fun main() {

// var n = 4

// for (row in 0 until n) {
//     for (col in 0 until n) {
//         if (col < row) {
//             print("  ")
//         } else {
//             print("* ")
//         }
//     }
//     println()
// }
// }

// * * * *
//  * * *
//    * *
//      *

// fun main() {

//     var n = 4

//     for (row in 0 until n) {
//         for(col in 0 until n-row){
//             print("* ")
//         }
//         println()
//     }
// }

// * * * *
// * * *
// * *
// *

// fun main() {

//     var n = 4

//     for (row1 in 0 until n) {
//         for (col1 in 0 until n) {
//             if (col1 < row1) {
//                 print("  ")
//             } else {
//                 print("* ")
//             }
//         }
//         print("  ")
//         for (col2 in 0 until n - row1) {
//             print("* ")
//         }
//         println()
//     }
// }

// * * * *  * * * *
//  * * *  * * *
//    * *  * *
//      *  *

// fun main() {
//     var n = 4
//     var startValue = 1

//     for (row in 0 until n) {
//         for (col in 0 until n) {
//             if (row > col) {
//                 print("  ")
//             } else {
//                 print("${startValue } ")
//                 startValue++
//             }
//         }
//         println()
//     }
// }

// 1 2 3 4
//  5 6 7
//    8 9
//      10

// fun main(){

// }

// 17 18 19 20
// 14 15 16
// 12 13
// 11

// fun main(){

// }

// 1 2 3 4  17 18 19 20
//   5 6 7  14 15 16
//     8 9  12 13
//        10 11

//       1
//     2 1
//   3 2 1
// 4 3 2 1

fun main() {
    var n = 4

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (j < n - (i + 1)) {

                print("  ")
            } else {
                print("${n-j} ")
            }
        }
        println()
    }
}
