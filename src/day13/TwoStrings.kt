package day13

//https://www.hackerrank.com/challenges/two-strings/problem?isFullScreen=true

fun twoStrings(s1: String, s2: String): String {
    //Create two empty hash sets
    val stringOneSet = hashSetOf<Char>()
    val stringTwoSet = hashSetOf<Char>()

    //Add characters of first string to the first
    for (i in s1.indices) {
        stringOneSet.add(s1[i])
    }

    //Add characters of second string to the second
    for (i in s2.indices) {
        stringTwoSet.add(s2[i])
    }

    //Get a set containing the intersection of first and second set
    stringOneSet.retainAll(stringTwoSet)

    //Return YES if the set is not empty
    return if (stringOneSet.size > 0) "YES" else "NO"
}