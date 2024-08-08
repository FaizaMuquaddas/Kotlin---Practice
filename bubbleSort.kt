// 1 4 3 5 7 6 10 8 9 2

fun main() {
    var bool = false
    val array = arrayOf(1, 4, 3, 5, 7, 6, 10, 8, 9, 2)
    while (!bool) {

        bool = true
        for (i in 0 until (array.size) - 1) {
            if (array[i] > array[i + 1]) {
                var swap = array[i]
                array[i] = array[i + 1]
                array[i + 1] = swap

                bool = false
            }
        }
    }

    for (row in array) {
        print("$row ")
    }
}
