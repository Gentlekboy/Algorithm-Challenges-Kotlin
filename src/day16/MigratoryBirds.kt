package day16

/*
https://www.hackerrank.com/challenges/migratory-birds
 */

import java.util.*

fun migratoryBirds(arr: Array<Int>): Int {
    //Create a tree map
    val treeMap = TreeMap<Int, Int>()

    //Add elements in the array into the tree map
    for (i in arr) {
        treeMap[i] = arr.count { it == i }
    }

    //Get the element with the highest value
    val answer = treeMap.maxByOrNull { it.component2() }

    //Return the key of the highest value
    return answer?.key ?: 0
}