package day18

/*
https://www.hackerrank.com/challenges/migratory-birds
 */

fun migratoryBirds2(arr: Array<Int>): Int {
    //Get the frequency of all 5 bird types
    val birdOne = arr.count { it == 1 }
    val birdTwo = arr.count { it == 2 }
    val birdThree = arr.count { it == 3 }
    val birdFour = arr.count { it == 4 }
    val birdFive = arr.count { it == 5 }

    var frequency = 0
    var birdTypeWithHighestFrequency = 0

    //Save the frequency of all bird types in an array
    val frequencyArray = arrayOf(birdOne, birdTwo, birdThree, birdFour, birdFive)

    //Loop through the frequencyArray and find the bird type with the highest occurrence
    for (currentPosition in frequencyArray.indices) {
        if (frequencyArray[currentPosition] > frequency) {
            frequency = frequencyArray[currentPosition]
            birdTypeWithHighestFrequency = currentPosition + 1
        }
    }

    //Return the bird type with the highest occurrence
    return birdTypeWithHighestFrequency
}