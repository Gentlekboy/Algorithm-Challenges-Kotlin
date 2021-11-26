package day7

fun main() {
    miniMaxSum(arrayOf(1, 2, 3, 4, 5))
}

fun miniMaxSum(arr: Array<Int>) {
    //Create variables to save the sum for both minimum and maximum
    //Note that the data type is Long. This is to accommodate for very huge integers
    var minimumSum: Long = 0
    var maximumSum: Long = 0

    //Sort the array from smallest to largest integers
    val sortedArray = arr.sorted()

    //Loop through the array and add all numbers from the first to the second to the last element
    for (i in 0..sortedArray.size-2) minimumSum += sortedArray[i]

    //Loop through the array and add all numbers from the second to the last element
    for (i in 1 until sortedArray.size) maximumSum += sortedArray[i]

    //Print the minimum and maximum sum on the console
    println("$minimumSum $maximumSum")
}