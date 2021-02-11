import java.awt.Color

fun main() {
  var dog=Dog1("Black","Pug")
}

//open class Animal1(var color:String="black"){
//
//    init {
//        println("$color")
//    }
//
//}
//
//class Dog1(
//    color: String,
//    var breed:String = "Black"):Animal1(color){
//
//    init {
//        println("$color and $breed")
//    }
//}

// inheritance with secondary constructor

open class Animal1{

    var color: String = ""

    constructor(color: String){
         this.color = color
    }
}

class Dog1:Animal1{

    var breed:String = ""

    constructor(color: String,breed:String):super(color){
       this.breed = breed
    }
}