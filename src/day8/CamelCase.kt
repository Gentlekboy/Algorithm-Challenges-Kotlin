package day8

fun main() {
    camelcase("oneTwoThree")
}

fun camelcase(s: String): Int {
    //Have a variable to store the number of words
    var numberOfWords = 1

    //Loop through the string
    //increment the number of words variable if an uppercase letter is found in the string
    for (i in s.indices){
        if (s[i].isUpperCase()){
            numberOfWords++
        }
    }

    //return the number of words variable
    return numberOfWords
}