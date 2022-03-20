package day19

//https://www.hackerrank.com/challenges/array-left-rotation/

fun rotateLeft(d: Int, arr: Array<Int>): Array<Int> {
    //Create a mutable list to manipulate elements easily
    val answer = arr.toMutableList()

    //Add an element to the end of the list and remove that element from it's initial position
    for (i in 0 until d) {
        answer.add(answer[0])
        answer.removeAt(0)
    }

    //Return the rotated array
    return answer.toTypedArray()
}