fun main() {

    fun checkAnagram(firstName: String, secondName: String) {

        var replacefirstName = firstName.replace(" ", "")
        var replacesecondName = secondName.replace(" ", "")

        var firstNameToLowerCase = replacefirstName.lowercase()
        var secondNameToLowerCase = replacesecondName.lowercase()

        var firstNameLength = firstNameToLowerCase.length
        var secondNameLength = secondNameToLowerCase.length

        if (firstNameLength == secondNameLength) {

            var dict = mutableListOf<Char>() //initializes an empty mutable list (dict) to store characters that are common to both names (mutable refer to modify meaning add ,remove elements from the list)

            for (i in 0 until firstNameLength) {
                for (j in 0 until secondNameLength) {
                    if (firstNameToLowerCase[i] == secondNameToLowerCase[j]) {
                        dict.add(firstNameToLowerCase[i])
                    } else {
                        continue
                    }
                }
            }

            if (dict.size == firstNameLength) {
                println("Is an anagram")
            }
            else {
                println("is not anagram")
            }
        } 
        else {
            println("is not anagram")
        }
            }
    println(checkAnagram("ajit", "faiza"))
}
