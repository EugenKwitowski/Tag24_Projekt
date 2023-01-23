fun main() {
    val numbers: List<Int> = listOf(34, 42, 235, 42, 42, 24, 42, 42, 7346, 34)

    for (i in 0 until numbers.size) {
        if (numbers[i] == 42) {
            continue
        }
        println(numbers[i])
    }
}