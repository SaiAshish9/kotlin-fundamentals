
fun main(args:Array<String>) {

    var myArray = Array<Int>(6){
        0
    }

    myArray[0] = 10
    myArray[1] = 42

    for(element in myArray){
        println(element)
    }

    for(i in 0..myArray.size -1){
        println(i)
    }

}

// Collections
// Immutable Collections
// Read Only Operations
// listOf
// mapOf
// setOf

// Mutable Collections
// Read And Write Both
// ArrayList, arrayListOf, mutableListOf
// HashMap,hashMapOf,mutableMapOf
// mutableSetOf,hashSetOf