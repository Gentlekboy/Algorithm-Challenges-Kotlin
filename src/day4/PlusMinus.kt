package day4

//Challenge link: https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

/*
Thought process:
We are given an array that may contain positive integers, negative integers and zeros.
We need to loop through the array and check if there are positive integers, negative integers or zeros.
If there are, we would want to have variables for each for counting how many each we got.
To find the ratio, we would divide each variable by the total number of items in the array (length of the array).
Finally, we can print each variable, rounding them to 6 decimal places
 */

fun main() {
    plusMinus(arrayOf(1, 1, 0, -1, -1))
}

fun plusMinus(arr: Array<Int>) {
    //Variables to save the counts of positive integers, negative integers and zeros
    var numberOfNegativeIntegers = 0.0
    var numberOfNPositiveIntegers = 0.0
    var numberOfZeros = 0.0

    //Size of the array
    val numberOfItemsInArray = arr.size

    //Loop through the array and count the number of positive integers, negative integers and zeros
    for (i in arr.indices){
        if (arr[i] < 0){
            numberOfNegativeIntegers++
        }else if (arr[i] == 0){
            numberOfZeros++
        }else{
            numberOfNPositiveIntegers++
        }
    }

    //Find the ratio of the number positive integers, negative integers and zeros
    val ratioOfPositive = numberOfNPositiveIntegers/numberOfItemsInArray
    val ratioOfNegative = numberOfNegativeIntegers/numberOfItemsInArray
    val ratioOfZeros = numberOfZeros/numberOfItemsInArray

    //Print the result in 6 decimal places on the console
    println("%.6f".format(ratioOfPositive))
    println("%.6f".format(ratioOfNegative))
    println("%.6f".format(ratioOfZeros))
}