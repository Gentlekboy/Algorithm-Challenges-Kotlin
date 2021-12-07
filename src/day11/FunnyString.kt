package day11

import kotlin.math.abs

fun main() {
    funnyString("bcxz")
}

fun funnyString(s: String): String {
    //Reverse the string
    val reversedString = s.reversed()

    //Create variables to store data we need
    val givenStringAsciiList = mutableListOf<Int>()
    val reversedStringAsciiList = mutableListOf<Int>()
    val givenStringAbsoluteDifferenceList = mutableListOf<Int>()
    val reversedStringAbsoluteDifferenceList = mutableListOf<Int>()

    //Get ASCII values and save them in a list
    for (i in s.indices) {
        givenStringAsciiList.add(s[i].code)
        reversedStringAsciiList.add(reversedString[i].code)
    }

    //Find the absolute value in the list of ASCIIs and save values in a new list
    for (i in 0..s.length-2) {
        val asciiDifferenceForGivenString = abs(givenStringAsciiList[i] - givenStringAsciiList[i + 1])
        val asciiDifferenceForReversedString = abs(reversedStringAsciiList[i] - reversedStringAsciiList[i + 1])

        givenStringAbsoluteDifferenceList.add(asciiDifferenceForGivenString)
        reversedStringAbsoluteDifferenceList.add(asciiDifferenceForReversedString)
    }

    //Check if both lists of absolute differences are the same
    return if (givenStringAbsoluteDifferenceList == reversedStringAbsoluteDifferenceList) {
        "Funny"
    } else "Not Funny"
}