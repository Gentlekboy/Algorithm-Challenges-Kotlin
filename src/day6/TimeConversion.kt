package day6

fun main() {
    timeConversion("12:05:00AM")
}

fun timeConversion(s: String): String {
    //Initialize required variables
    val hour = s.substring(0, 2).toInt()
    val meridiem = s.substring(8, 10)
    val timeWithoutHoursAndMeridiem = s.substring(2, 8)
    val timeWithoutMeridiem = s.substring(0, 8)

    //Create a variable to easily access numbers from 13-23 and 0 based on the 24-hour clock
    val myHourArray = arrayOf("00", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23")

    //Variable that holds the answer in military time
    var answerInMilitaryTime = ""

    //Check conditions
    if (hour == 12 && meridiem == "AM"){
        answerInMilitaryTime += myHourArray[0] + timeWithoutHoursAndMeridiem
    }else if (hour < 12 && meridiem == "PM"){
        answerInMilitaryTime += myHourArray[hour] + timeWithoutHoursAndMeridiem
    }else answerInMilitaryTime += timeWithoutMeridiem

    //Return the answer in military time
    return answerInMilitaryTime
}