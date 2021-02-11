
fun main() {

    var dog = Dog()
    dog.breed = "labra"
    dog.color = "black"

    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.color = "white"
    animal.eat()

}


open class Animal {
    open var color: String = ""

    open fun eat() {
        println("eat")
    }

}

// public final class -> class
// public final var -> var
// no longer final in nature



open class Test{
    open fun eat(){

    }
}


class Dog : Animal(){

    var breed: String = ""

    override var color:String="red"

    fun bark() {
        println("bark")
    }

    override fun eat() {
        super<Animal>.eat()
//        super.eat()
//        multiple inheritance is not allowed
        println("dog")
    }

}

class Cat : Animal() {
    var age: Int = -1

    fun meow() {
        println("meow")
    }

    override fun eat() {
        super.eat()
        println("cat")
    }

}

// by default classes are public and final