fun main() {
    var row = 4
    var last = row*(row+1) + 1
    var start = 1
    var temp : Int
    var space = " "

    var temp2 = last/2

    var str = temp2.toString()

    for(i in 0 until row){
        print(space.repeat(i*2))
        temp = last - row + i
        last = temp
        for(j in 0 until (row-i)*2){
            if(j==row-i && i<row-1){
                print(space.repeat(str.length-1))
            }
            if(j < row-i){
                print("$start ")
                start++
            }
            else{
                print ("$temp ")
                temp++                
            }
        }
        println()
}
}