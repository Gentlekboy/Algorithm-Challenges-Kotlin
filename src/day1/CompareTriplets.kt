package day1

/*
Alice and Bob each created one problem for HackerRank.
A reviewer rates the two challenges,
awarding points on a scale from 1 to 100 for three categories:
problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]),
and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points
by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points.

Example

a = [1, 2, 3]
b = [3, 2, 1]
For elements *0*, Bob is awarded a point because a[0] .
For the equal elements a[1] and b[1], no points are earned.
Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second.
 */

fun main() {
    val a = arrayOf(1, 2, 3)
    val b = arrayOf(3, 2, 1)
    compareTriplets(a,b)
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    //Create variables to store a and b's comparison points
    var scoreForA = 0
    var scoreForB = 0

    /*
    Since the rating is a triplet (3 values in each array),
    start a loop that goes 3 times,
    and check if value of A at an index
    is greater or lesser or equal to value at same index in B
     */
    for (i in a.indices) {
        if (a[i] > b[i]) {
            scoreForA++

        } else if (b[i] > a[i]) {
            scoreForB++
        }
    }

    //Return an array of the comparison point
    return arrayOf(scoreForA, scoreForB)
}