fun main(){

    
    var a = 2
    var n = 10
    var temp = 1

    while(n >= 2){
        if(n%2 != 0){ // 
            n = n-1  // n = 4
            temp = temp * a
    }

    n = n/2
    a = a*a // a = 4 now and n =5  , a = 4*4 and n = 2 

}
print(a*temp)
}

// 2'10 == 2*2'5
// 4'5 == 4*4'4     temp = 16


