fun main() {
    val a = 5
    val b = 10
//    var maxValue:Int
//    if(a>b)
//        maxValue = a
//    else {
//        maxValue = b
//    }
//
    var maxValue = if (a > b) {
        println("a")
        a
    } else {
        println("b")
        b
    }

//    println(maxValue)

    val x= 3
    when(x){
        0,1 -> println(1)
        2 -> println(2)
        in 4..10 -> println("4-10")
//        !in
        else -> {
            println("nf")
        }
    }

    var str:String = when(x){
        1 -> "a"
        else -> {
            "a"
            "b"
        }
    }

    println(str)

//    if when expressions
}