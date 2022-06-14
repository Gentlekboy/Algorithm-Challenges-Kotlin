package day24

//Challenge question: https://leetcode.com/problems/length-of-last-word/

fun lengthOfLastWord(s: String): Int {
    return s.trim().split(" ").last().length
}