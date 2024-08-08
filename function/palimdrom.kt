 // palimdrom (eg- check if both words are same bot , tob)  and anagram - eg (rome more)

// palimdrom
// user input
// remove spaces
// other term capital letter and small ascii value diff , so make all letter capital or small 
// String reverse
// check both variables

fun main(){
    
    fun checkPalimdrom (name: String) : String{
        var replaceName = name.replace(" ", "")
        var nameToLowerCase = replaceName.lowercase()
        var reverseName = nameToLowerCase.reversed()

        if (nameToLowerCase == reverseName){

            return "Is palimdrome"
        }
        else{
            return "Is not a palimdrome"
        }
    }
println (checkPalimdrom("bob"))
}