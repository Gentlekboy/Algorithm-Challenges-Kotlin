package day9

fun main() {
    hackerrankInString("hhaacckkekraraannk")
}

fun hackerrankInString(s: String): String {
    //Use a regex to check if what we have in the string matches the regex pattern
    if (s.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*".toRegex())){
        return "YES"
    }else {
        return "NO"
    }
}