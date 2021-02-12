fun main() {
    val country= Country()
    country.name = "India"
    println(country.name)
    country.setup()
}

class Country{
    lateinit var name:String
    fun setup(){
        name="sai"
        println("$name")
    }
}

// lateinit used only with mutable datatype [var]
// lateinit used only with non-nullable data type
// lateinit values must be initialised before you use it.

