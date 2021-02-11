fun main(args:Array<String>) {

    var p = Person2()


    with(p){
        name = "Sai"
        age = 19
    }

//    with keyboard is a part of kotlin standard library
//    not kotlin language.

    p.apply {
        name="Sai"
    }

    p.apply {
        name = "Ashish"
        age = 20
    }.startRun()

//    we can call method using apply method

    println(p.name)
    println(p.age)

}

class Person2 {

    var name:String = ""
    var age:Int = -1

    fun startRun(){
        println("Person2")
    }

}

