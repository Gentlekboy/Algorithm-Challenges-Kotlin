package day3

import java.lang.Math.abs

//Challenge link: https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

fun main() {
    val arr = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(9, 8, 9))
    diagonalDifference(arr)
}
/*
    Thought process: This is a 2D array (an array holding arrays of integers).
    Since the given array will always be a square matrix,
    I should be able to loop through the parent array,
    target the values at diagonals (from left to right and right to left),
    get the sum of numbers at the diagonal from left to right,
    and the sum from the right to the left.
    Finally, I can subtract the two sums and find the absolute value (value that is not a negative integer).
 */
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    //Initialize variables to store the sum of numbers from left to right and right to left
    var summationFromLeftToRight = 0
    var summationfromRightToLeft = 0

    //Loop through the parent array
    for (i in arr.indices) {
        //Get the sum of the numbers on the diagonal from left to right
        summationFromLeftToRight += arr[i][i]

        //Get the sum of the numbers on the diagonal from right to left
        summationfromRightToLeft += arr[i][arr.lastIndex - i]
    }

    //return the absolute difference
    return abs(summationFromLeftToRight - summationfromRightToLeft)
}