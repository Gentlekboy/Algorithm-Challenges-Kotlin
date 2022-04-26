package day22

//Question: https://leetcode.com/problems/contains-duplicate/

fun containsDuplicate1(nums: IntArray): Boolean {

    //Since sets don't allow duplicates, add all elements in the array to a set.
    //If there are duplicates, then the sizes of both set and array will not be equal
    return nums.size != nums.toSet().size
}

fun containsDuplicate2(nums: IntArray): Boolean {
    //Convert the intArray to a list for grouping
    //The eachCount() method returns a map of elements in the
    //intArray as a key and number of occurrence as its value
    //The any function returns a boolean based on instruction in its lambda
    return nums
        .toList()
        .groupingBy { it }
        .eachCount()
        .any { it.value > 1 }
}