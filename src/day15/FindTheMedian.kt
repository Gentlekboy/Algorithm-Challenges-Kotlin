package day15

//https://www.hackerrank.com/challenges/find-the-median/problem?isFullScreen=true

fun findMedian(arr: Array<Int>): Int {
    //Sort the array
    val sortedArray = arr.sorted()

    //Return the middle element
    return sortedArray[sortedArray.size/2]
}