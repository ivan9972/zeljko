import kotlin.math.sqrt

fun main() {
    print("Unesi a: ")



    val a = readLine()!!.toDouble()

    print("Unesi b: ")
    val b = readLine()!!.toDouble()

    print("Unesi c: ")
    val c = readLine()!!.toDouble()

    // Diskriminanta
    val D = b * b - 4 * a * c

    if (D < 0) {
        println("No solution available in R")
    } else if (D == 0.0) {
        val x = -b / (2 * a)
        println("Jednadžba ima jedno realno rješenje: x = $x")
    } else {
        val x1 = (-b + sqrt(D)) / (2 * a)
        val x2 = (-b - sqrt(D)) / (2 * a)
        println("Rješenja su: x1 = $x1, x2 = $x2")
    }
}

