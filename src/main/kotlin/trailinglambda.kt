//5.8
import kotlin.random.Random
import kotlin.random.nextInt
fun main() {

        runSimulation("Guyal") { playerName, numBuildings ->
            val currentYear = 2018
            println("Adding $numBuildings houses")
            "Welcome to SimVillage, $playerName! (copyright $currentYear)"
        }
    }

    fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
        val numBuildings = Random.nextInt(1..5) // Randomly selects 1, 2, or 3
        println(greetingFunction(playerName, numBuildings))
    }