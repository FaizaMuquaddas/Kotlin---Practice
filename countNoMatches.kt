class Sol{
    fun numberOfMatches(n: Int): Int {

        var matches = 0
        var teams = n
        
        while(teams > 1 ){

            if(teams%2 == 0){
                matches += teams/2
                teams = n/2
            }
            else{
                matches += ((n-1)/2)
                teams = ((n-1)/ 2+1)
            }

        }
        return matches
    }
}

fun main(){
    var sol = Sol()
    var result = sol.numberOfMatches(14)
    println(result)
}

//  Details of the tournament:
// - 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
// - 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
// - 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
// - 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
// Total number of matches = 7 + 3 + 2 + 1 = 13.