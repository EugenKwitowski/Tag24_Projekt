fun main() {
    /*val fees = listOf(363.34, 235.45, 753.45, 234.56, 658.33, 22.65, 2623.46, 475.54)


    var sum = 0.00

    for (i in fees) {
        sum += i
    }
    println(sum)*/

    feesSum()
}

val fees = listOf(363.34, 235.45, 753.45, 234.56, 658.33, 22.65, 2623.46, 475.54)

fun feesSum(): Double {

    var sum = 0.00
    for (i in fees) {
        sum += i
    }
    return sum
}