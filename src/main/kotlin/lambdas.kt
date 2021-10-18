//5.7
import kotlin.random.Random
import kotlin.random.nextInt
import runSimulation as runSimulation1

fun main() {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"    }
       runSimulation("Guyal", greetingFunction)

}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = Random.nextInt(1..5)
    println(greetingFunction(playerName, numBuildings))
}



