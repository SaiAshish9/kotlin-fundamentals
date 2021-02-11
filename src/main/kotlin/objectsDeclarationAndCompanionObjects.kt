fun main() {
    CustomerData.count = 98
    CustomerData.typeOfCustomers()
    println(CustomerData.count)
}

object CustomerData: MySuperClass() {
    var count:Int = -1
    fun typeOfCustomers():String{
        return "Indian"
    }
    override fun myMethod(str: String) {
        super.myMethod(str)
        print(str)
    }
}

open class MySuperClass {
    open fun myMethod(str:String){

    }
}

// Singleton

// When we just have one instance of a class in the whole application
// Meaning of singleton is that we cannot create objects for that class.
// There exists only one object for that class which is created by kotlin internally

// static

// In Kotlin, we cannot declare "static" variables and methods
// Alternative is to declare "object"
// this creates a singleton object when program runs