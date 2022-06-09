package day23

//Challenge link: https://leetcode.com/problems/plus-one/

fun plusOne(digits: IntArray): IntArray {
    //Create variables for array and string operations
    var number = ""
    val answer = arrayListOf<Int>()

    //Loop through the input array and add each element to a string variable
    digits.forEach { number += it }

    //Covert the string to a long and add 1 to it
    val answerString = (number.toLong() + 1).toString()

    //Loop through answerString and add each element to the the answer list
    answerString.forEach { answer.add(it.digitToInt()) }

    //Convert the list to an integer array
    return answer.toIntArray()
}