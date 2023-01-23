fun main() {
    val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau"
    )

    var redShirts  = mutableListOf<String>()
    var blueShirts: MutableList<String> = mutableListOf()

    for (i in shirts.indices){
        if (shirts[i] == "rot"){
            var redShirt = shirts[i]
            redShirts.add(redShirt)

        }
        if (shirts[i] == "blau"){
            var blueShirt = shirts[i]
            blueShirts.add(shirts[i])
            }
        }
    println("Es gibt ${redShirts.size} rote Shirts")
    println("Es gibt ${blueShirts.size} blaue Shirts")
    }