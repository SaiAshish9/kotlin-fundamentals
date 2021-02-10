fun main() {
    add()
    println(add(3,4))
    var large= max(4,5)
    println("greater number is $large")
}

fun add(){
    var a = 2
    var b = 4
    println("Sum ${a+b}")
}

fun add(a:Int,b:Int) :Int{
    return a+b
}

fun max(a:Int,b:Int): Int = if(a>b) {a} else b

//fun max(a:Int,b:Int):Int{
//    if(a>b)
//        return a
//    else
//        return b
//}