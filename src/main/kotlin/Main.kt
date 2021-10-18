//5.0
fun main() {
    val numLetter = "Mississippi".count()
    print(numLetter)


    val numLetters = "Mississippi".count({ letter -> letter == 's'    })
    print(numLetters)


}