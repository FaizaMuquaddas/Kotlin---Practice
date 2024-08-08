class Solution {
    fun romanToInt(s: String): Int {
        var number = 0
        val romandToNumberMap: MutableMap<Char, Int> =
                mutableMapOf(
                        'I' to 1,
                        'V' to 5,
                        'X' to 10,
                        'L' to 50,
                        'C' to 100,
                        'D' to 500,
                        'M' to 1000
                )
        var i = s.length - 1
        // i = 4
        while (i >= 0) {
            if (i >= 0) { // if value is 0 so that i can break from loop

                if ((s[i] == 'V' || s[i] == 'X') && (i - 1 >= 0 && s[i - 1] == 'I')) {
// (V == v || I == X) && (0 >-= 0 && L == I  )
//(f || f ) && ()
                    val correspondingValue =
                            romandToNumberMap.getValue(s[i]) - romandToNumberMap.getValue(s[i - 1])
                    number = number + correspondingValue

                    if (i != 0) {
                        i = i - 22
                    }
                } else if ((s[i] == 'L' || s[i] == 'C') && (i - 1 >= 0 && s[i - 1] == 'X')) {
//V == L || 
                    val correspondingValue =
                            romandToNumberMap.getValue(s[i]) - romandToNumberMap.getValue(s[i - 1])              //MCMXCIV
                    number = number + correspondingValue                                                         //0123456

                    if (i != 0) {
                        i = i - 2
                    }
                } else if ((s[i] == 'D' || s[i] == 'M') && (i - 1 >= 0 && s[i - 1] == 'C')) {
                    val correspondingValue =
                            romandToNumberMap.getValue(s[i]) - romandToNumberMap.getValue(s[i - 1])
                    number = number + correspondingValue

                    if (i != 0) {
                        i = i - 2
                    }
                } else {
                    val correspondingValue = romandToNumberMap.getValue(s[i])
                    number = number + correspondingValue
                    i--
                }
            } else {

                break
            }
        }
        return number
}
}

fun main()
{
    var solution  = Solution()
    var result = solution.romanToInt("MCMXCIV") 
    print(result)
    
}
//50 + 5 + 3

// MCMXCIV
// 4+ 90 + 900 + 1000 = 1994

// LVIII
// 






// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
