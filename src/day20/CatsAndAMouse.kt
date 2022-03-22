package day20

fun catAndMouse(x: Int, y: Int, z: Int): String {
    //Get the distance of both cats from the mouse
    val catXDistanceFromMouse = if (x > z) x - z else z - x
    val catYDistanceFromMouse = if (y > z) y - z else z - y

    //Return which cat is closest or the mouse, if both cats are of equal distance
    return if (catXDistanceFromMouse > catYDistanceFromMouse) {
        "Cat B"
    } else if (catXDistanceFromMouse < catYDistanceFromMouse) {
        "Cat A"
    } else "Mouse C"
}