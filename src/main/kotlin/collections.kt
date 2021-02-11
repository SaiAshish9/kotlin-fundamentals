
fun main(args:Array<String>) {

//    var myArray = Array<Int>(6){
//        0
//    }
//    myArray[0] = 10
//    myArray[1] = 42
//    for(element in myArray){
//        println(element)
//    }
//    for(i in 0..myArray.size -1){
//        println(i)
//    }
//    var list = listOf<String>("a","b","c")
//    for(i in list){
//        println(i)
//    }
//    for(i in 0..list.size-1){
//        println(i)
//        println(list[i])
//    }
//    list = mutableListOf<String>("a","b")
//    list.add("d")
//    list.remove("a")
//    list.add(1,"e")
//    list = ArrayList<String>()
//    list = arrayListOf<String>()

//    var list:ArrayList<String> = ArrayList<String>()


    var myMap = mapOf<Int,String>(
        2 to "sai",
        3 to "ashish"
    )

    var myMap1 = HashMap<Int,String>()
//    mutableMapOf<Int,String>()
//    hashMapOf<Int,String>()

    myMap1.put(4,"a")
//    replace(

    for (key in myMap.keys){
        println("$key->${myMap[key]}")
    }

    var mySet = setOf<Int>(1,2,8,9,9)

    for (e in mySet){
        println(e)
    }

    mySet = mutableSetOf<Int>(2,54,7,0,9,9)
    mySet.remove(8)
    mySet.add(100)

    for (e in mySet){
        println(e)
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