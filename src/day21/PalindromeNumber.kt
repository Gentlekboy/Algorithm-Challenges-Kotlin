package day21

//Question: https://leetcode.com/problems/palindrome-number/

fun isPalindrome1(x: Int): Boolean {
    //Covert the integer to a string
    val xToString = x.toString()

    //Reverse the current string and compare it with the current string
    val areStringsTheSame = xToString == xToString.reversed()

    //Return the answer if input is a positive or negative integer
    return if (x < 0) false else areStringsTheSame
}

fun isPalindrome2(x: Int): Boolean {
    //Covert the integer to a string for iteration
    val xToString = x.toString()

    //get the length of the string
    val lengthOfX = xToString.length

    //If the input is a negative integer, then we want to return false
    if (x < 0) return false

    //Loop through half the size of the string
    //Check if the corresponding adjacent positions have same values
    //Return true or false where appropriate
    for (i in 0..(xToString.length / 2)) {
        if (xToString[i] != xToString[lengthOfX - 1 - i]) {
            return false
        }
    }
    return true
}