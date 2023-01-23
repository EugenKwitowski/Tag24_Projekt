fun main() {
    val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)

   /* var i = 0

    while (i in numbers.indices) {
        var newNumbers = numbers[i] * 3
        i++
        println(newNumbers)
    }*/

    funktion(3)
}

val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)

fun funktion(a: Int){

    var i = 0

    while (i in numbers.indices) {
        var newNumbers = numbers[i] * a
        i++
        println(newNumbers)
    }
}

