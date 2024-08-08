// 1.  *****
//     *****
//     *****
//     *****
//     *****

// fun main(){
//     var n = 5
//     for (i in 0 until n){
//         for (j in 0 until n){
//             print("*")
//         }
//         println()
//     }
// }

// 2.  *
//     **
//     ***
//     ****
//     *****

// fun main(){
//     var n = 5

//     for(i in 0 until n){
//         for(j in 0..i){
//             print("*")
//         }
//         println()
//     }
// }

// 3.  *****
//     ****
//     ***
//     **
//     *

// fun main(){
//     var n = 5

//     for(i in 0 until n){
//         for(j in 0 until n-i){
//             print("*")
//         }
//         println()
//     }
// }

// 4.  1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5

// fun main(){
//     var n = 5

//     for(i in 0 until n){
//         for(j in 1..i+1){
//             print("$j ")
//         }
//         println()
//     }
// }

// 5.  *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *

// fun main() {
//     var n = 5

//     for (i in 0 until n * 2) {

//         var temp = i
//         if (i > n - 1) temp = n - (i - n)

//         for (j in 0 until temp) {
//             print("*")
//         }
//         println()
//     }
// }

// 6.       *
//         **
//        ***
//       ****
//      *****

// fun main(){
//     var n = 5

//     for(i in 0 until n){
//         for(j in 0 until n){
//             if(j < (n-1)-i){
//                 print(" ")
//             }
//             else{
//                 print("*")
//             }
//         }
//         println()
//     }
// }

// 7.   *****
//       ****
//        ***
//         **
//          *

// fun main(){
//     var n = 5

//     for(i in 0 until n){
//         for(j in 0 until n){
//             if(j < i){
//                 print(" ")
//             }
//             else{
//                 print("*")
//             }
//         }
//         println()
//     }
// }

// 8.      *
//        ***
//       *****
//      *******
//     *********

// fun main(){
//     var n = 5

//     for(i in 0 until n){
//         for(j in 0 until n*2){
//             if(j<n-i || j > n+i){
//                 print(" ")
//             }
//             else{
//                 print("*")
//             }
//         }
//         println()
//     }
// }

// 9.  *********  00 - 09
//      *******   11 - 18
//       *****    22 - 27
//        ***     33 - 36
//         *

// fun main(){
//     var n = 5

//     for(i in 0 until n){
//         for(j in 0 until n*2){
//             if(j >=i  && j < ((n*2)-1) - i ){
//                 print("*")
//             }
//             else{
//                 print(" ")
//             }
//         }
//         println()
//     }
// }

// 10.      *                  04
//         * *               13  15
//        * * *            22  24  26
//       * * * *         31  33  35  37
//      * * * * *      40  32  33  46  48

// fun main() {
//     var n = 5
//     var bool = true
//     for (i in 0 until n) {
//         for (j in 0 until n+i) {
//             if ((j < (n-1)-i || j > n+i) == bool) {
//                 print(" ")
//                 bool = true
//             } else {
//                 print("*")
//                 bool = false
//             }
//         }
//         bool = true
//         println()
//     }
// }

// 11.  * * * * *
//       * * * *
//        * * *
//         * *
//          *

// fun main() {
//     var n = 5
//     var bool = true
//     for (i in 0 until n) {
//         for (j in 0 until (n*2)-i) {
//             if(j>i == bool){
//                 print("*")
//                 bool = false
//             }
//             else{
//                 print(" ")
//                 bool = true
//             }
//         }
//         bool = true
//         println()
//     }
// }

// 12.  * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *

// fun main() {
//     var n = 5
//     // var bool = true
//     for (i in 0 until n*2) {
//         for (j in 0 until (n*2)-i) {

//         }
//         println()
//     }
// }

// 13.      *
//         * *
//        *   *
//       *     *
//      *********

// 04-04  no space
// 13-15
// 22-26
// 31-37
// 40-48

// fun main() {
//     var n = 5
//     for (i in 0 until n) {
//         for (j in 0 until n + i) {
//             if (i+j == n-1 || j-i == n-1 || i == n-1 ) {
//                 print("*")
//             } else {
//                 print(" ")
//             }
//         }
//         println()
//     }
// }

// 14.  *********
//       *     *
//        *   *
//         * *
//          *

// 00-08
// 11-17
// 22-26
// 33-35
// 44-44

// fun main() {
//     var n = 5

//     for (i in 0 until n) {
//         for (j in 0 until (n * 2) - (i+1)) {
//             if (i == 0 || (i == j || i + j == (n - 1) * 2)) {
//                 print("*")
//             } else {
//                 print(" ")
//             }
//         }
//         println()
//     }
// }

// 15.      *
//         * *
//        *   *
//       *     *
//      *       *
//       *     *
//        *   *
//         * *
//          *

// 16.           1
//             1   1
//           1   2   1
//         1   3   3   1
//       1   4   6   4   1

// 17.      1
//         212
//        32123
//       4321234
//        32123
//         212
//          1

// 18.   **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
//       *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********

// 19.    *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

// 20.    ****
//        *  *
//        *  *
//        *  *
//        ****

// 00  03
// 10  13
// 20  23
// 30  33
// 40  43

// fun main() {
//     var n = 5

//     for (i in 0 until n) {
//         for (j in 0 until n-1) {
//             if (j == 0 || j == (n-1)-1 || i == 0 || i == n-1) {
//                 print("*")
//             } else {
//                 print(" ")
//             }
//         }
//         println()
//     }
// }

// 21.    1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

// 22.    1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

// 23.        *      *
//          *   *  *   *
//        *      *      *

// 24.    *        *
//        **      **
//        * *    * *
//        *  *  *  *
//        *   **   *
//        *   **   *
//        *  *  *  *
//        * *    * *
//        **      **
//        *        *

// 25.       *****
//          *   *
//         *   *
//        *   *
//       *****

// fun main(){

//     var n = 5
//     var i = 0
//     var j = n-1
//     val array2D = Array(n) {IntArray((n*2)-1) {0}}

//     while(j<(n*2)-1){
//         array2D[i][j++] = 1
//     }
//     i++
//     j = (n-1)-i

//     while(i<n){
//         array2D[i++][j--] = 1
//     }

//     i--
//     j++

//     while(j < n){
//         array2D[i][j++] = 1
//     } //3-1
//         i--

//     while(i > 0){
//         array2D[i--][j++] = 1
//     }

//     for(row in array2D){
//         for(col in row){
//             if(col == 0){
//                 print(" ")
//             }
//             else{
//                 print("*")
//             }
//         }
//         println()
//     }
// }

// #appraoch 2

// fun main() {

//     var n = 5
//     var i = 0
//     var j = n - 1
//     val array2D = Array(n) { IntArray((n * 2) - 1) { 0 } }

//     while (j < (n * 2) - 1) {
//         array2D[i][j] = 1
//         array2D[n - 1][j - (n - 1)] = 1

//         j++
//     }

//     i++
//     j = (n - 1) - i

//     while (i < n - 1) {
//         array2D[i][j] = 1
//         array2D[i][(n-1)+j] = 1

//         j--
//         i++
//     }

//     for (row in array2D) {
//         for (col in row) {
//             if (col == 0) {
//                 print(" ")
//             } else {
//                 print("*")
//             }
//         }
//         println()
//     }
// }

// 26.   1 1 1 1 1 1
//       2 2 2 2 2
//       3 3 3 3
//       4 4 4
//       5 5
//       6

// fun main(){
//     var n = 6
//     for(i in 0 until n){
//         for(j in 0 until n-i){
//             print("${i+1} ")
//         }
//         println()
//     }
// }

// 27.   1 2 3 4  17 18 19 20
//         5 6 7  14 15 16
//           8 9  12 13
//             10 11

// 28.      *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *

// 29.
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

// 30.         1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5

// 31.      4 4 4 4 4 4 4
//          4 3 3 3 3 3 4
//          4 3 2 2 2 3 4
//          4 3 2 1 2 3 4
//          4 3 2 2 2 3 4
//          4 3 3 3 3 3 4
//          4 4 4 4 4 4 4

// 32.    E
//        D E
//        C D E
//        B C D E
//        A B C D E

// fun main() {
//     var n = 5
//     var i = 4
//     var j = 0
//     var temp = 65

//     val array2D = Array(n) { IntArray(n) { 0 } }

//     while (i >= 0) {
//         while (j <= i) {
//             array2D[i][j] = temp+j
//             j++
//         }
//         j = 0
//         temp++
//         i--
//     }
//     for (row in array2D) {
//         for (col in row) {
//             if(col == 0 ){
//                 print(" ")
//             }
//             else{
//                 print("${col.toChar()} ")
//             }
//         }
//         println()
//     }
// }

// 33.    a
//        B c
//        D e F
//        g H i J
//        k L m N o

// 34.    E D C B A
//        D C B A
//        C B A
//        B A
//        A

fun main(){
    var n = 5
    var i = 4
    var j = 0

    val array2D = Array2D(n) {IntArray2D(n) {0}}

    while(i >= 0 ){
        while(j )
    }

    for(row in array2D){
        for(col in row){
            print(col)
        }
        println()
    }
}

// 35.    1      1
//        12    21
//        123  321
//        12344321

