package day5

/*
Thought Process:
We should have a variable to track the tallest candle
and another to count the number of the tallest candles
(both variables should be equal to zero initially).
We can loop through the array, check if the value at a particular position
is greater than the tallest candle variable.
If true, we would want to set that value as the tallest candle
and make the count of the tallest candle equal to one.
If false, we check if the value at a particular position
is equal to the tallest candle variable.
If true, we would want to increase the count of the tallest candles.
If false, we would want to continue looping through the array.
After we have checked the entire array,
we can return the variable holding the number of the tallest candles.
 */

fun main() {
    birthdayCakeCandles(arrayOf(3, 2, 1, 3))
}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    //Create variables to keep track of the tallest candle and the number of the tallest candles
    var tallestCandle = 0
    var numberOfTallestCandles = 0

    //Loop through the candles and find the tallest
    for(i in candles){
        if(i > tallestCandle){
            numberOfTallestCandles = 1
            tallestCandle = i

        //Once you find the tallest, increase the count to track number of the tallest candles
        }else if(i == tallestCandle){
            numberOfTallestCandles++
        }
    }

    //Return the number of the tallest candles
    return numberOfTallestCandles
}