
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


    var list = listOf<String>("a","b","c")

    for(i in list){
        println(i)
    }

    for(i in 0..list.size-1){
        println(i)
        println(list[i])
    }

    list = mutableListOf<String>("a","b")
    list.add("d")
    list.remove("a")
    list.add(1,"e")

    list = ArrayList<String>()
    list = arrayListOf<String>()

//    var list:ArrayList<String> = ArrayList<String>()





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