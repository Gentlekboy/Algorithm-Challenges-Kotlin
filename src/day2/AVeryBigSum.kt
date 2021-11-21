package day2

/*
    In this challenge, you are required to calculate
    and print the sum of the elements in an array,
    keeping in mind that some of those integers may be quite large.

    Example: array = [1000000001, 1000000002, 1000000003, 1000000004, 1000000005]
    Answer: 5000000015
*/

fun main() {
    val ar = arrayOf<Long>(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
    aVeryBigSum(ar)
}

fun aVeryBigSum(ar: Array<Long>): Long {
    var sumOfArrayElements: Long = 0

    for (i in ar.indices){
        sumOfArrayElements += ar[i]
    }

    return sumOfArrayElements
}