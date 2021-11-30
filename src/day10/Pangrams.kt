package day10

import java.util.*


fun main() {
    pangrams("We promptly judged antique ivory buckles for the next prize")
}

fun pangrams(s: String): String {
    //Covert the string to lowercase
    val lower = s.lowercase()

    //Create a hashset to save all the alphabets without duplicates
    val setOfCharacters: MutableSet<Char> = HashSet()

    //Loop through the lowercase array and add all letters to the hashset
    for (i in lower.indices) {
        if (lower[i].isLetter()){
            setOfCharacters.add(lower[i])
        }
    }

    //If the hashset contains 26 elements, return "pangram", else "not pangram"
    return if (setOfCharacters.size != 26) "not pangram" else "pangram"
}