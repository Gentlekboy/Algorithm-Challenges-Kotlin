package day17

/*
https://www.hackerrank.com/challenges/migratory-birds
 */

fun migratoryBirds(arr: Array<Int>): Int {
    //Initialize variables
    var frequency = 0
    var birdTypeWithHighestFrequency = 0

    for (i in arr.indices) {
        //Get the frequency of each element
        val frequencyOfABirdType = arr.count { it == arr[i] }

        //Check which element has the highest occurrence
        if (frequencyOfABirdType > frequency) {
            frequency = frequencyOfABirdType
            birdTypeWithHighestFrequency = arr[i]
        }
    }

    //Return the bird type with the highest occurrence
    return birdTypeWithHighestFrequency
}