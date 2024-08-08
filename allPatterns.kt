// 1.  *****
//     *****
//     *****
//     *****
//     *****

fun pattern1(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n) {
            print("*")
        }
        println()
    }
}

// 2.  *
//     **
//     ***
//     ****
//     *****

fun pattern2(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until i + 1) {
            print("*")
        }
        println()
    }
}

// 3.  *****
//     ****
//     ***
//     **
//     *

// fun main() {
fun pattern3(n: Int) {
    // var n = 5
    for (i in 0 until n) {
        for (j in 0 until n - i) {
            print("*")
        }
        println()
    }
}

// 4.  1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5

// fun main() {
//     var n = 5
fun pattern4(n: Int) {
    for (i in 0 until n) {
        for (j in 1..i + 1) {
            print("$j ")
        }
        println()
    }
}

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
fun pattern5(n: Int) {
    for (i in 1 until (n * 2)) {

        var temp = i // 7 - //8
        if (i > 5) {
            temp = n - (i - n) // 6-n // 1 -- // 7-n / 2
        }
        for (j in 0 until temp) {
            print("*")
        }
        println()
    }
}

// 6.       *
//         **
//        ***
//       ****
//      *****

fun pattern6(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (j < (n - i) - 1) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// 7.   *****
//       ****
//        ***
//         **
//          *

fun pattern7(n: Int) {
    for (i in 0 until n) {
        for (j in 0..n) {
            if (j > i) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

// 8.      *          00 01 02 03 04 05 06 07 08 09    04- 4
//        ***         10 11 12 13 14 15 16 17 18 19    15 - 6
//       *****        20 21 22 23 24 25 26             26 - 8
//      *******                            37          37 - 10
//     *********

// m = 5
// n = 9

// approach 1
fun pattern8(row: Int) {
    var col = (row * 2) - 1
    var temp = col / 2

    for (i in 0 until row) {
        for (j in 0 until col) {
            if (i + j >= row - 1 && i + j <= temp) {
                print("*")
            } else {
                print(" ")
            }
        }
        temp += 2
        println()
    }
}

// approach 2

fun pattern81(n: Int) {
    
    for(i in 0 until n){
        for(j in 0 until (n*2)){
            if(j<n-i || j > n+i){
                print(" ")
            }
            else{
                print("*")
            }
        }
        println()
    }
}

// approach 3
fun pattern82(n: Int) {
    //     var n = 5
    for (i in 0 until n) {
        for (j in 1..n + i) {
            if (j <= n - (i + 1)) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// 9.  *********
//      *******
//       *****
//        ***
//         *

fun pattern9(n: Int) {
    //     var n = 5

    for (i in 0 until n) {
        for (j in 0 until ((n * 2) - (i + 1))) {
            if (j < i) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// 10.      *                    00 01 02 03 04 05 06 07 08            04
//         * *                   10 11 12 13 14 15 16 17 18          13  15
//        * * *                  20 21 22 23 24 25 26 27 28        22  24  26
//       * * * *                 30 31 32 33 34 35 36 37 38      31  33  35  37
//      * * * * *                40 41 42 43 44 45 46 47 48    40  42  44  46  48

fun pattern10(n: Int) {
    //     var n = 5
    var b = false
    for (i in 0 until n) {
        for (j in 0 until n + i) {
            if ((i + j < n - 1 || j - i > n - 1) == !b) {
                //                 //  i=0
                //                 // 0+0 <4 || 0-0 > 4  == true
                //                 // 0+1 <4 || 1-0 > 4  == true
                //                 // 0+2 <4 || 2-0 > 4  == true
                //                 // 0+3 <4 || 3-0 > 4  == true
                //                 // 0+4 <4 || 4-0 > 4  == true

                //                 // i=1
                //                 // 1+0 = 1 <4 || 0-1 = -1 > 4 == true  T
                //                 // 1+1 = 2 <4 || 1-1 = 0  > 4 == true  T
                //                 // 1+2 = 3 <4 || 2-1 = 1  > 4 == true  T
                //                 // 1+3 = 4 <4 || 3-1 = 2  > 4 == true  F
                //                 // 1+4 = 5 <4 || 4-1 = 3  > 4 == false F  (T)
                //                 // 1+5 = 5 <4 || 5-1 = 4  > 4 == false F

                //                 // i=2
                //                 // 2+0 = 2 <4 || 0-2 = -2 > 4 == true  T
                //                 // 2+1 = 3 <4 || 1-2 = -1 > 4 == true  T
                //                 // 2+2 = 4 <4 || 2-2 = 0  > 4 == true  F
                //                 // 2+3 = 5 <4 || 3-2 = 1  > 4 == false T
                //                 // 2+4 = 6 <4 || 4-2 = 2  > 4 == true  F
                //                 // 2+5 = 7 <4 || 5-2 = 3  > 4 == false T
                //                 // 2+6 = 8 <4 || 6-2 = 4  > 4 == false F

                print(" ")
                b = false
            } else {
                print("*")
                b = true
            }
        }
        println()
        b = false
    }
}

// 11.  * * * * *
//       * * * *
//        * * *
//         * *
//          *

fun pattern11(n: Int) {
    var b = false
    for (i in 0 until n) {
        for (j in 0 until (n * 2) - (i + 1)) {
            if (j >= i == !b) {
                //
                print("*")
                b = true
            } else {
                print(" ")
                b = false
            }
        }
        println()
        b = false
    }
}

// 12.  * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *      5        i = 5
//         * *     6        i = 6   4 3 2 1 0
//        * * *    7
//       * * * *   8
//      * * * * *  9   4<=5

fun pattern12(n: Int) {
    var b = false
    for (i in 0 until n * 2) {
        var temp = (n * 2) - (i + 1)
        var temp2 = i
        if (i > n - 1) {
            temp = i
            temp2 = (n * 2) - (i + 1)
        }
        for (j in 0 until temp) {
            if (j < temp2 == !b) {
                //  0 < 0 == true F
                // 1<0 == false  t
                //  2<0 == false T

                print(" ")
                b = false
            } else {
                print("*")
                b = true
            }
        }
        b = false
        println()
    }
}

// approach2
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *

fun pattern121(n: Int) {
    // var b = false
    for (i in 0 until n * 2) {
        for (j in 0 until (n * 2) - (i + 1)) {
            if (j < i) {
                print(" ")
            } else {
                print("*")
            }
        }
        for (k in 0 until i) {
            if (k > (n * 2) - (i + 1)) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// 13.      *
//         * *
//        *   *
//       *     *
//      *********

fun pattern13(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n - (i + 1)) {
            print(" ")
        }
        for (k in 0 until i + i + 1) {
            if ((i != 0 && i != (n - 1)) && (k > i - i && k < i + i)) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}
//          *             05
//         * *          13  16
//        *   *       22      27
//       *     *    31          38
//      ********* 40              49
// row*col
// approach 2

fun pattern131(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n + i) {
            if ((j < n - (i + 1) || (j >= n - i && j + 1 < n + i)) && i != n - 1) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

//          *
//         * *    4<j<6
//        *   *   3<j<7
//       *     *  2<j<8
//      *********

// revision 133

fun pattern133(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n + i) {
            if ((j + 1 < n - i || (j >= n - i && j + 1 < n + i)) && i != n - 1) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// 14.  *********
//       *     *
//        *   *
//         * *
//          *

fun pattern14(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until (n * 2) - (i + 1)) {
            if ((j < i || (j > i && j + 1 < (n * 2) - (i + 1))) && i != 0) {
                // 1<j<7   range for spaces in b/w
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// 15.      *
//         * *     4<j<6
//        *   *    3<j<7
//       *     *   2<j<8
//      *       *  1<j<9
//       *     *   2<j<8
//        *   *    3<j<7
//         * *     4<j<6
//          *

fun pattern15(n: Int) {
    for (i in 0 until (n * 2) - 1) {
        var temp = n + i
        if (i > n - 1) {
            // we could have also written it as i+1>n
            temp = ((n * 2) - 1) - ((i + 1) - n)
        }
        for (j in 0 until temp) {
            var temp2 = j + 1 < n - i
            var temp3 = j + 1 > n - i && j + 1 < n + i
            //
            if (i > n - 1) {
                temp2 = j < (i + 1) - n
                temp3 = j > (i + 1) - n && j + 1 < ((2 * n) - 1) - ((i + 1) - n)
            }
            if (temp2 || temp3) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// 16.           1
//             1   1
//           1   2   1
//         1   3   3   1
//       1   4   6   4   1

//            1                                                 05
//         1    1                                             14 16
//       1    2   1                                          23 25  27
//     1   3    3    1                                    32  34  36  38
//   1   4    6    4   1                                41  43  45  47   49
// 1   5   10   10   5   1                            50  52  54  56   58  5-10

// step 1: Identify row and column
// step 2: row 0 & 1 will hold value 1 always and
// col will be dependent on the value of n
// step 3: first end value will always be 1
// & next value will be the sum of the previous row 2 col values

fun pattern16(n: Int) {
    val array2D = Array(n) { IntArray((n * 2) - 1) { 0 } }

    var i = n - 1
    var j = 0
    var bool = true

    while (i >= 0) {
        array2D[i--][j++] = 1
    }
    i = 1
    while (i < n) {
        array2D[i++][j++] = 1
    }

    i = 2
    j = n - (i - 1)

    while (i < n) {
        while (j >= n - (i - 1) && j <= (n - 1) + (i - 2)) {
            if (bool) {
                array2D[i][j] = array2D[i - 1][j - 1] + array2D[i - 1][j + 1]
                bool = false
                j++
            } else {
                bool = true
                j++
            }
        }
        i++
        j = n - (i - 1)
        bool = true
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print("  ")
            } else {
                print("$col ")
            }
        }
        println()
    }
}

// 17.      1
//         212
//        32123
//       4321234
//        32123
//         212
//          1

fun pattern17(n: Int) {
    val array2D = Array(n) { IntArray(n) { 0 } }
    var i = 0
    var j = (n - 1) / 2
    var k = 0
    var count = 0

    while (i < n) {
        while (count <= k) {
            array2D[i][j--] = ++count
        }
        count = 0
        j = (n - 1) / 2

        while (count <= k) {
            array2D[i][j++] = ++count
        }
        count = 0
        j = (n - 1) / 2

        if (n % 2 == 0 && i == j) {
            k = (n / 2) - 1
        } else {
            if (i >= j) {
                k--
            } else {
                k++
            }
        }
        i++
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print(" ")
            } else {
                print("$col")
            }
        }
        println()
    }
}

// approach2
fun pattern171(n: Int) {
    val array2D = Array(n) { IntArray(n) { 0 } }

    for (j in 0 until n) {
        for (i in (n / 2) - j..(n / 2) + j) {}
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print(" ")
            } else {
                print("$col")
            }
        }
        println()
    }
}

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

fun pattern18(n: Int) {
    val array2D = Array(n * 2) { IntArray(n * 2) { 0 } }
    // var temp = n
    var i = 0
    var j = 0
    var k = 0

    while (i < n) {
        while (j < n - i) {
            array2D[i][j++] = 1
        }
        j = n + i
        while (j >= n + i && j < n * 2) {
            array2D[i][j++] = 1
        }
        i++
        j = 0
    }

    while (i < n * 2) {
        while (j <= k) {
            array2D[i][j++] = 1
        }
        j = ((n * 2) - 1) - k
        while (j >= ((n * 2) - 1) - k && j < n * 2) {
            array2D[i][j++] = 1
        }
        k++
        i++
        j = 0
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print(" ")
            } else {
                print("*")
            }
        }

        println()
    }
}

// 19.    *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

fun pattern19(n: Int) {
    for (i in 0 until (n * 2) - 1) {
        for (j in 0 until n * 2) {
            if ((j > i && j < ((n * 2) - (i + 1))) || (j <= i && j + 1 > ((n * 2) - (i + 1)))) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
// approach2
fun pattern19_1(n: Int) {
    for (i in 0 until (n * 2) - 1) {
        for (j in 0 until n * 2) {
            var temp = j > i && j < ((n * 2) - (i + 1))
            if (i > n - 1) {
                temp = j >= n - ((i + 1) - n) && j < n + ((i + 1) - n)
            }
            if (temp) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// approach3
fun pattern19_2(n: Int) {
    var a = n * 2
    for (i in 0 until n) {
        for (j in 0 until a) {
            if (j <= i || j >= a - i - 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }

    for (i in n - 1 downTo 0) {
        for (j in 0 until a) {
            if (j < i || j > (a - i - 1)) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}
// 20.    ****
//        *  * 0<j<3
//        *  * 0<j<3
//        *  * 0<j<3
//        ****

fun pattern20(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n - 1) {
            if ((j > 0 && j + 1 < n - 1) && (i != 0 && i != n - 1)) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// 21.    1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

fun pattern21(n: Int) {
    var temp = 1
    for (i in 0 until n) {
        for (j in 0..i) {
            print("$temp ")
            temp++
        }
        println()
    }
}

// 22.    1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

fun pattern22(n: Int) {
    var a = true
    var b = true
    for (i in 0 until n) {
        for (j in 0..i) {
            if (a == b) {
                print(1)
                b = !b
            } else {
                print(0)
                b = !b
            }
        }
        a = !a
        b = true
        println()
    }
}

// 23.      *   *
//         * * * *
//        *   *   *

//    02
//  11  13
// 20      24

// j>=0 && j<(n+1)-temp  || j>(n+1)-temp && j<(n+1)+temp
// i=4, n=5
// 0>=0 && 0<6 || 0> 6 && 0< 6
// true && true || false && true
//

fun pattern23(n: Int) {
    var space = " "
    var k = (n - 1) * 2
    var m = (n - 1) * 4 - 1

    for (i in 0 until n) {
        print(space.repeat(k))
        k -= 2
        print("*")

        if (i != 0) {
            print(space.repeat(i * 4 - 1))
            print("*")
        }

        if (m > 0) {
            print(space.repeat(m))
            print("*")
            m -= 4
        }

        if (i != 0) {
            print(space.repeat(i * 4 - 1))
            print("*")
        }

        println()
    }
}

// approach2
fun pattern231(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until (n * 2) - 1) {
            if ((j < n - (i + 1)) || j > n - (i + 1) && j < (n - 1) + i || j > (n - 1) + i) {
                print("  ")
            } else {
                print("* ")
            }
        }
        for (j in 0 until (n * 2) - 1) {
            if ((j < n - (i + 2)) || j > n - (i + 2) && j < (n - 2) + i || j > (n - 2) + i) {
                print("  ")
            } else {
                print("* ")
            }
        }
        println()
    }
}

// 24.    *        *
//        **      **
//        * *    * *   j>0 - j<2   j>7
//        *  *  *  *   j>0 - j<3   j>6   >9
//        *   **   *
//        *   **   *
//        *  *  *  *   j4- j5
//        * *    * *   j3-j6
//        **      **
//        *        *

fun pattern24(n: Int) {
    var col = n * 2
    for (i in 0 until n) {
        for (j in 0 until col) {
            if ((j > 0 && j < i) ||
                            (j > i && j < col - (i + 1)) ||
                            (j > col - (i + 1) && j < col - 1)
            ) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
    for (i in 0 until n) {
        for (j in 0 until col) {
            if ((j > 0 && j < n - (i + 1)) ||
                            (j > n - (i + 1) && j < n + i) ||
                            (j > n + i && j < col - 1)
            ) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// 25.
//    *****  n=5   j=8
//   *   *
//  *   *
// *   *
// *****

//     ******  n=6   j=10
//    *
//   *
//  *
// *
// ******

//      *******
//     *
//    *              n=7, j=12
//   *
//  *
// *
// *******
fun pattern25(n: Int) {
    val array2D = Array(n) { IntArray((n * 2) - 1) { 0 } }
    var i = 0
    var j = n - 1
    var k = 0

    while (j >= n - 1 && j < (n * 2) - 1) {
        array2D[i][j++] = 1
        array2D[n - 1][k++] = 1
    }
    j = (n - 2)
    k = (n * 2) - 3

    while (i < n - 2) {
        array2D[++i][j--] = 1
        array2D[i][k--] = 1
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// 26.   1 1 1 1 1 1
//       2 2 2 2 2
//       3 3 3 3
//       4 4 4
//       5 5
//       6

fun pattern26(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n - i) {
            print("${i+1} ")
        }
        println()
    }
}

// 27.   1 2 3 4  17 18 19 20
//         5 6 7  14 15 16
//           8 9  12 13
//             10 11

fun pattern27(n: Int) {
    val array2D = Array(n) { IntArray((n * 2) + 1) { 0 } }

    var i = 0
    var k = n + 1
    var count = 1

    while (i < n) {
        var j = i
        while (j < n) {
            array2D[i][j] = count++
            j++
        }
        i++
    }
    i--
    while (i >= 0) {
        var j = n + 1
        while (j <= k) {
            array2D[i][j] = count++
            j++
        }
        k++
        i--
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print("  ")
            } else {
                print("$col  ")
            }
        }
        println()
    }
}

// appraoch 2

fun pattern271(n: Int) {
    var count = 1
    var end = (n + 1) * n

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (j >= i) {
                print("$count ")
                count++
            } else {
                print("  ")
            }
        }
        var start = end - (n - (i + 1))
        end = start - 1
        print("  ")

        for (j in 0 until n) {
            if (j < n - i) {
                print("$start ")
                start++
            } else {
                print("  ")
            }
        }
        println()
    }
}

// 28.      *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *

//  n=5       04
//          13  15
//        22  24  26
//      31  33  35  37
//    40  42  44  46  48
//      51  53  55  57
//        62  64  66
//          73  75
//            84

// n=6           05
//             14  16
//           23  25  27
//         32  34  36  38
//       41  43  45  47  49
//     50  52  54  56  58  510      15       5
//       61  63  65  67  69         15       3    2 2 2 2 2   i-j == temp  temp -= 2   temp = n/2
//         72  74  76  78           15       1
//           83  85  87             15      -1
//             94  96               15      -3
//               105                15      -5

fun pattern28(n: Int) {
    //     var n = 5
    var b = false
    var temp2 = n / 2

    for (i in 0 until (n * 2) - 1) {
        var temp = n + i
        if (i + 1 > n) {
            // i=5       5+1>5
            temp = ((n * 2) - 1) - ((i + 1) - n)
            //                      (10-1  -   6-5)      9-1      8
            //
        }
        for (j in 0 until temp) {
            var c = (i + j < n - 1 || j - i > n - 1) == !b
            if (i + 1 > n) {
                c = (i - j <= n - 1 || i - j <= temp2) == b
            }
            if (c) {
                // 5-0 < 4 || 5-0 <= 2 == false  T
                // 5-1 <= 4 || 5-1 <= 2 == false  F   (F)
                // 5-2 <= 4 || 5-2 <= 2 == true T

                print(" ")
                b = false
            } else {
                print("*")
                b = true
            }
        }
        println()
        b = false
        temp2 -= 2
    }
}

// appraoch 2

//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *

// fun main(){
//     var n = 5
fun pattern28_1(n: Int) {
    for (i in 0 until (n * 2) - 1) {
        var totalCol = i + 1
        if (i + 1 > n) {
            totalCol = (2 * n) - (i + 1)
        }

        var spaces = n - totalCol
        for (k in 0 until spaces) {
            print(" ")
        }
        for (j in 0 until totalCol) {
            print("* ")
        }
        println()
    }
}

// 30.         1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5

fun pattern30(n: Int) {
    val array2D = Array(n) { IntArray((n * 2) - 1) { 0 } }

    for (j in 0 until (n * 2) - 1) {
        var k = j
        var row = (n - (j + 1))
        if (j >= n) {
            k = n - (j - (n - 2))
            row = (j + 1) - n
        }

        for (i in 0..k) {
            array2D[row + i][j] = n - k
        }
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print(" ")
            } else {
                print("$col")
            }
        }
        println()
    }
}

// 31.      4 4 4 4 4 4 4     00 01 02 03 04 05 06
//          4 3 3 3 3 3 4     10 11 12 13 14 15 16
//          4 3 2 2 2 3 4     20 21 22 23 24 25 26
//          4 3 2 1 2 3 4     30 31 32 33 34 35 36
//          4 3 2 2 2 3 4     40 41 42 43 44 45 46
//          4 3 3 3 3 3 4     50 51 52 53 54 55 56
//          4 4 4 4 4 4 4     60 61 62 63 64 65 66

fun pattern31(n: Int) {
    var twoDArray = Array(n) { IntArray(n) { 0 } }
    var temp2 = 1
    var iRow = n / 2
    if (n % 2 != 0) {
        iRow = (n + 1) / 2
    }
    var temp = iRow

    for (i in 0 until iRow) {
        var iterate = n - temp2

        if (i == iRow - 1) {
            iterate = n - (n - 1)
        }

        // for i = 0, 6 times,  n-1
        // for i = 1, 4 times,  n-3
        // for i = 2, 2 times,  n-5
        // for i = 3, 1 times,  n-6

        for (j in 0 until iterate) {
            twoDArray[j + i][i] = temp
        }

        for (j in 0 until iterate) {
            twoDArray[(n - 1) - i][j + i] = temp
        }

        for (j in 0 until iterate) {
            twoDArray[((n - 1) - j) - i][(n - 1) - i] = temp
        }

        for (j in 0 until iterate) {
            twoDArray[(n - n) + i][((n - 1) - j) - i] = temp
        }

        temp--
        temp2 += 2
    }
    for (i in twoDArray) {
        for (j in i) {
            print("$j")
        }
        println()
    }
}

// 32.    H                 72
//        G H               71 72
//        F G H             70-72
//        E F G H           69-72
//        D E F G H
//        C D E F G H
//        B C D E F G H
//        A B C D E F G H

fun pattern32(n: Int) {
    var diff = 65 + n - 1
    for (i in 0 until n) {
        for (j in diff - i..diff) {
            print("${j.toChar()} ")
        }
        println()
    }
}

// 33.    a             33.0  0           f
//        B c                 1 0         t f
//        D e F               1 0 1       t f t
//        g H i J             0 1 0 1     f t f t
//        k L m N o           0 1 0 1 0   f t f t f

// 33.0
fun pattern330(n: Int) {
    var a = true
    for (i in 0 until n) {
        for (j in 0..i) {
            if (!a) {
                print(1)
                a = !a
            } else {
                print(0)
                a = !a
            }
        }
        println()
    }
}

// 33.    a            97
//        B c          66 99
//        D e F        68 101 70
//        g H i J      103 72 105 74
//        k L m N o
// ASCII value for small letter from 97-122 and for capital 65-90

fun pattern33(n: Int) {
    var a = true
    var small = 97
    var capital = 66
    for (i in 0 until n) {
        for (j in 0..i) {
            if (!a) {
                print("${capital.toChar()} ")
                capital += 2
                a = !a
            } else {
                print("${small.toChar()} ")
                small += 2
                a = !a
            }
        }
        println()
    }
}
// 34.    E D C B A
//        D C B A
//        C B A
//        B A
//        A

fun pattern34(n: Int) {
    var diff = 65 + n - 1
    for (i in 0 until n) {
        // highest to lowest value here 69-65
        for (j in diff - i downTo 65) {
            // var values = j.toChar() || another method to store and then print
            print(j.toChar())
        }
        println()
    }
}
// ASCII 65 START VALUE FOR CAPITAL LETTERS

// 35.    1      1
//        12    21
//        123  321
//        12344321

fun pattern35(n: Int) {
    //     var n = 21
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (j <= i) {
                print(j + 1)
            } else {
                print(" ")
            }
        }
        for (k in 0 until n) {
            if (k + 1 < (n - i)) {
                // 1<4
                // 2<4
                // 3<4
                // 4<4

                print(" ")
            } else {
                print(n - k)
            }
        }
        println()
    }
}

// 36.*      *
//    **    **
//    ***  ***
//    ********

fun pattern36(n: Int) {
    //     var n =4
    for (i in 0 until n) {
        for (j in 0 until n * 2) {
            if (j > i + j && j < ((n * 2) - (i + 1))) {
                // 0 > 0+0 & 0< 8-1
                //  1> 1 & 1
                //  2>2
                //  6> 6 & 6<7

                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

// extra
// 37. 2D Array

fun pattern37(n: Int) {
    var twoDArray = Array(n) { IntArray(n) { 0 } }

    for (i in 0 until n) {
        for (j in 0 until n) {
            twoDArray[j][i] = j + 1
        }
    }

    for (i in twoDArray) {
        for (j in i) {
            print("$j ")
        }
        println()
    }
}

// 38.      1 16 15 14 13      n=5
//          2 17 24 23 12
//          3 18 25 22 11
//          4 19 20 21 10
//          5 06 07 08 09

fun pattern38(n: Int) {
    var twoDArray = Array(n) { IntArray(n) { 0 } }
    var count = 1
    var i = 0
    var j = 0
    var k = 0

    while (count <= n * n) {

        while (i < n - j) {
            twoDArray[i++][j] = count++
        }

        i--
        j++

        while (j <= i) {
            twoDArray[i][j++] = count++
        }

        i--
        j--

        while (i >= k) {
            twoDArray[i--][j] = count++
        }

        i++
        j--

        while (j > k) {
            twoDArray[i][j--] = count++
        }

        i++
        j++
        k++
    }

    for (row in twoDArray) {
        for (col in row) {
            print("$col ")
        }
        println()
    }
}

// 39.   1 1    00 01 02
//       1        11
//      1 1    20 21 22

// 1    1   00      04
//  1  1      11  13
//   1          22
//  1  1      31  33
// 1   1    40      44

// appraoch 1
fun pattern39(n: Int) {
    // var twoDArray = Array(n) {IntArray(n) {0}}
    var temp = n - 1

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j || i + j == temp) {
                print("1")
            } else {
                print(" ")
            }
        }
        println()
    }
}

// appraoch2 TWO-D_ARRAY

fun pattern39_1(n: Int) {
    var twoDArray = Array(n) { IntArray(n) { 0 } }
    var temp = n - 1

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j || i + j == temp) {
                twoDArray[i][j] = 1
            }
        }
    }

    // for(row in twoDArray){
    //     for(col in row){
    //         if(col == 0){
    //             print(" ")
    //         }
    //         else{
    //             print("$col")
    //         }
    //     }
    //     println()
    // }

    do {
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (twoDArray[i][j] == 0) {
                    print(" ")
                } else {
                    print(twoDArray[i][j])
                }
            }
            println()
        }
        temp--
    } while (temp >= 0)
}

// SUM of 2D Array
// 5 5 5
// 5 5 5
// 5 5 5
// sum of array is: 45

fun pattern39_2(n: Int) {
    var array2D = Array(n) { Array(n) { 5 } }
    var sum = 0

    for (i in 0 until n) {
        for (j in 0 until n) {
            sum += array2D[i][j]
        }
    }
    print("sum of array is: $sum")
}

// 40.
// J I H G
// F E D
// C B
// A

// n=4 , 10
// n=5, 15
// n=6, 21
// n=7, 28
//
fun pattern40(n: Int) {
    var array2D = Array(n) { Array(n) { 0 } }
    var temp = 65

    // a65 j74

    for (i in n - 1 downTo 0) {
        for (j in (n - 1) - i downTo 0) {
            array2D[i][j] = temp++
        }
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print("  ")
            } else {
                print("${col.toChar()} ")
            }
        }
        println()
    }
}

// 41.

// 0// 1
// 1// AB
// 2// 123
// 3// ABCD
// 4// 12345
// 5// ABCDEF
fun pattern41(n: Int) {
    for (i in 0 until n) {
        for (j in 0..i) {
            if (i % 2 == 0) {
                print("${j+1}")
            } else {
                print("${(65+j).toChar()}")
            }
        }
        println()
    }
}

// 42.

// 1AAAA
// 22BBB
// 333CC
// 4444D

fun pattern42(n: Int) {
    for (i in 0 until n - 1) {
        for (j in 0 until n) {
            if (j <= i) {
                print("${i+1}")
            } else {
                print("${(i+65).toChar()}")
            }
        }
        println()
    }
}

// 43.
// 4444
// 3444
// 2344
// 1234

// 4
// 34
// 234
// 1234

fun pattern43(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (j <= i) {
                print((n - i) + j)
            } else {
                print("$n")
            }
        }
        println()
    }
}

//        1
//        2  3
//        4  5  6
//        7  8  9  10
// 44.     11 12 13 14 15

fun pattern44(n: Int) {
    val array2D = Array(n) { IntArray(n) { 0 } }
    var count = 1
    for (i in 0 until n) {
        for (j in 0..i) {
            array2D[i][j] = count++
        }
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print(" ")
            } else {
                print("$col ")
            }
        }
        println()
    }
}

// 44.     11 12 13 14 15
//        7  8  9  10
//        4  5  6
//        2  3
//        1

fun pattern45(n: Int) {
    val array2D = Array(n) { IntArray(n) { 0 } }
    var count = 1

    for (i in 0 until n) {
        for (j in 0..i) {
            array2D[(n - 1) - i][j] = count++
        }
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print(" ")
            } else {
                print("$col ")
            }
        }
        println()
    }
}

// appraoch2
fun pattern451(n: Int) {
    val array2D = Array(n) { IntArray(n) { 0 } }
    var count = 1

    for (i in n downTo 0) {
        for (j in 0 until n - i) {
            array2D[i][j] = count++
        }
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print(" ")
            } else {
                print("$col ")
            }
        }
        println()
    }
}

// 46.
//     *
//   * *
//  *   *
// *     *
//* * * * *

fun pattern46(n: Int) {
    var temp = n - 1
    for (i in 0 until n) {
        for (j in 0 until (n * 2) - 1) {
            if ((i + j == n - 1 || j - i == temp) || (i == temp && j % 2 == 0)) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

// array2D -> 2
// n =5 , 16  n-1  n-2  n-3
fun pattern461(n: Int) {
    val array2D = Array(n) { IntArray((n * 2) - 1) { 0 } }
    var i = 0
    var j = n - 1
    while (i < n) {
        array2D[i][j - i] = 1
        i++
    }
    i--
    j = 2
    while (j <= ((n * 2) - 2)) {
        array2D[i][j] = 1
        j += 2
    }
    i--
    j = (n * 2) - 3
    while (i > 0) {
        array2D[i--][j--] = 1
    }

    for (row in array2D) {
        for (col in row) {
            if (col == 0) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}

fun main() {
    var n = 5
    var choice = -1
    while (true) {
        if (n == 0) break
        if (n == -1) {
            choice = -1
            n = 5
        }
        if (choice == -1) {
            println("Please enter Pattern number or 0 to exit:")

            // Read a line of text from the terminal
            val inputString = readLine()
            choice = inputString!!.toInt()
            if (choice == 0) break
            println("N is $n")
            println()
        }
        when (choice) {
            1 -> pattern1(n)
            2 -> pattern2(n)
            3 -> pattern3(n)
            4 -> pattern4(n)
            6 -> pattern6(n)
            7 -> pattern7(n)
            8 -> pattern8(n)
            5 -> pattern5(n)
            8_1 -> pattern81(n)
            8_2 -> pattern82(n)
            9 -> pattern9(n)
            10 -> pattern10(n)
            11 -> pattern11(n)
            12 -> pattern12(n)
            12_1 -> pattern121(n)
            13 -> pattern13(n)
            13_1 -> pattern131(n)
            14 -> pattern14(n)
            15 -> pattern15(n)
            16 -> pattern16(n)
            17 -> pattern17(n)
            17_1 -> pattern171(n)
            18 -> pattern18(n)
            19 -> pattern19(n)
            20 -> pattern20(n)
            21 -> pattern21(n)
            22 -> pattern22(n)
            23 -> pattern23(n)
            231 -> pattern231(n)
            24 -> pattern24(n)
            25 -> pattern25(n)
            26 -> pattern26(n)
            27 -> pattern27(n)
            271 -> pattern271(n)
            28 -> pattern28(n)
            28_1 -> pattern28_1(n)
            30 -> pattern30(n)
            31 -> pattern31(n)
            32 -> pattern32(n)
            33 -> pattern33(n)
            34 -> pattern34(n)
            35 -> pattern35(n)
            36 -> pattern36(n)
            37 -> pattern37(n)
            38 -> pattern38(n)
            39 -> pattern39(n)
            39_1 -> pattern39_1(n)
            39_2 -> pattern39_2(n)
            40 -> pattern40(n)
            41 -> pattern41(n)
            42 -> pattern42(n)
            43 -> pattern43(n)
            44 -> pattern44(n)
            45 -> pattern45(n)
            451 -> pattern451(n)
            46 -> pattern46(n)
            461 -> pattern461(n)
            // 50 -> pattern50(n)
            -1 -> choice = -1
            0 -> break
            else -> println("Enter a valid number")
        }
        println()
        println("Enter n value to change n or -1 to run different pattern or 0 to exit")
        val newInputString = readLine()
        n = newInputString!!.toIntOrNull() ?: n
    }
}

// you are given two number a and n. find a^n. time complexity must not exceed O(log n)

// fun pattern50(n: Int) {

//     var i = 0
//     var a = 2
//     var result = a

//     // for (i in 0 until n) {
//     result = result * a
//     //
//     if (i > n) {
//         pattern50(result)
//         i++
//     } else {
//         print(result)
//         return result
//     }
// }
