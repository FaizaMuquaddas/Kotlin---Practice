// fun main(){
//     var size = 4
//     for (i in 0 until size){
//         for(j in 0 until size){
//             println("*")
//         }
//         println()   
//     }
// }

fun main(){
    var row = 5
    var col = (row*2)-1
    var temp = col / 2

    for( i in 0 until row){
        for(j in 0 until col){
            if(i+j >= row-1 && i+j <=temp){
                print("*")
            }
            else{
                print(" ")
            }
            
        }
        temp +=2
        println()
    }
}

//   *   
//  ***  
// ***** 
//*******  4-7

//    *   
//   ***  
//  ***** 
// *******
//********* 5-9

// 6-11