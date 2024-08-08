fun main(){
    fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}



val index = parseInt("12")


if (index != null) {
    println("${index::class.simpleName}")
} else {
    println("index is null")
}
}





