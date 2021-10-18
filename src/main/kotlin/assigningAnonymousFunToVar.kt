//5.1
fun main() {

        //Function type syntax ()->return type
            val greetingFunction: () -> String = {
                val currentYear = 2018
                "Welcome to SimVillage, Mayor! (copyright $currentYear)"
            }

       println(greetingFunction())
}
