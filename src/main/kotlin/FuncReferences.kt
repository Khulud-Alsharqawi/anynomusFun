//5.10
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    runSimulation("Guyal", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}
inline fun runSimulation( playerName: String,greetingFunction: (String, Int) -> String) {
    val numBuildings = Random.nextInt(1..5) // Randomly selects 1, 2, or 3
    println(greetingFunction(playerName, numBuildings))
}
fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}
//5.11==================================================================================
//inline fun runSimulation(
//    playerName: String,
//    costPrinter: (Int) -> Unit,
//    greetingFunction: (String, Int) -> String
//) {
//    val numBuildings = Random.nextInt(1..5) // Randomly selects 1, 2, or 3
//    costPrinter(numBuildings)
//    println(greetingFunction(playerName, numBuildings))
//}
//fun printConstructionCost(numBuildings:) {
//    val cost = 500
//    println("construction cost: ${cost * numBuildings}")
//    return numBuildings
//}
//5.12===================================================================================
//fun main() {
//
//        runSimulation("Guyal", ::printConstructionCost) { playerName, numBuildings ->
//            val currentYear = 2018
//            println("Adding $numBuildings houses")
//            "Welcome to SimVillage, $playerName! (copyright $currentYear)"
//        }
//    }

/*5.13
fun main() {
runSimulation()
}
fun runSimulation() {
 val greetingFunction = configureGreetingFunction()
 println(greetingFunction("Guyal"))
}
fun configureGreetingFunction(): (String) -> String {
 val structureType = "hospitals"
 var numBuildings = 5
 return { playerName: String ->
 val currentYear = 2018
 numBuildings += 1
 println("Adding $numBuildings $structureType")
 "Welcome to SimVillage, $playerName! (copyright $currentYear)"
 }
}
* */
