fun main() {

}
//
//public fun run(){
//
//}
//
//private class  Person{
//
//}
// kotlin supports public private protected internal
// internal -> within the same module

class TestClass {

    fun testing(){
        var p = Person()
        print(p.c)
    }

}

open class Person {

    private val a = 1
    protected val b = 2
    internal val c =3
    val d = 10

}

class Indian:Person(){

}

