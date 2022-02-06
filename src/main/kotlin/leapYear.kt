fun main(args: Array<String>) {
    val year = 1900
    var leap = false

    leap = if (year % 4 == 0) {
        if (year % 100 == 0) {
            year % 400 == 0
        } else
            true
    } else
        false

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}