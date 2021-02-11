
fun main() {

    var dog = Dog()
    dog.breed =  "labra"
    dog.color = "black"

    dog.bark()
    dog.eat()

    var cat= Cat()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.color = "white"
    animal.eat()

}


open class Animal {
    var color: String = ""

   fun eat(){
       println("eat")
   }

}

// public final class -> class
// public final var -> var


// no longer final in nature
class Dog:Animal(){

    var breed:String = ""

    fun bark(){
       println("bark")
    }

}

 class Cat :Animal(){
    var age:Int = -1

    fun meow(){
        println("meow")
    }

}

// by default classes are public and final