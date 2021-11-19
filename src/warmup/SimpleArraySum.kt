package warmup

/*
Given an array of integers, find the sum of its elements.
Sample 1 Input:
arr = [1, 2, 3]

Sample 1 Output:
6

Sample 2 Input:
arr = [1, 2, 3, 4, 10, 11]

Sample 2 Output:
31
 */

fun main() {
    val ar = arrayOf(1, 2, 3)
    simpleArraySum(ar)
}

fun simpleArraySum(ar: Array<Int>): Int {
    //Have a variable to store the sum of values in the array
    var arraySum = 0

    //Loop through the array to each number and add them
    for (i in ar.indices){
        arraySum += ar[i]
    }

    //Return the total sum
    return arraySum
}