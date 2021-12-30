package day12
/*
The hamming distance between two strings of equal length is
the number of positions at which the corresponding symbols are different.
In more technical terms, it is a measure of the minimum number of changes
required to turn one string into another.
For example, the Hamming distance between:
"karolin" and "kerstin" is 3.
"kathrin" and "kerstin" is 4.
0000 and 1111 is 4.

Source: https://www.linkedin.com/posts/activity-6882091340512014336-lckz
 */

fun hammingDistance(firstString: String, secondString: String): Int {
    //Create a variable to store the hamming distance
    var hammingDistance = 0

    //Go through the string and check where characters are different
    for (position in firstString.indices) {
        if (firstString[position] != secondString[position]) {
            hammingDistance++
        }
    }

    //Return the hamming distance (number of times characters were different)
    return hammingDistance
}