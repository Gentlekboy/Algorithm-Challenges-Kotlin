package day14

//https://www.hackerrank.com/challenges/anagram/problem?isFullScreen=true

fun anagram(s: String): Int {
    var numberOfCharacters = 0
    val lengthOfString = s.length
    val firstSubString = s.substring(0, lengthOfString/2)
    var secondSubString = s.substring(lengthOfString/2, lengthOfString)

    if (lengthOfString % 2 != 0) {
        //When string length is an odd number, return -1
        numberOfCharacters = -1

    }else {
        //When string length is an even number
        for (character in firstSubString) {
            //Where a character of firstSubString is in secondSubString, get the index of occurrence
            val index = secondSubString.indexOf(character)

            if (index == -1) {
                //If any character of firstSubString is not in secondSubString, increase this count
                numberOfCharacters++
            }else {
                //If any character of firstSubString is in secondSubString, remove that character from secondSubString
                secondSubString = secondSubString.substring(0, index) + secondSubString.substring(index + 1)
            }
        }
    }

    return numberOfCharacters
}