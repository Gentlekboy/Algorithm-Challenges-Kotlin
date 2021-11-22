package day2

/*
    This is a staircase of size n = 4
       #
      ##
     ###
    ####

    Its base and height are both equal to n.
    It is drawn using # symbols and spaces.
    The last line is not preceded by any spaces.
    Write a program that prints a staircase of size
*/

fun main() {
    staircase(5)
}

fun staircase(n: Int) {
    for(i in 1..n){
        //Add spaces appropriately
        print(" ".repeat(n-i))

        //Add hashes appropriately
        print("#".repeat(i))

        //Leave a line and continue with the loop
        println()
    }
}