fun main() {

    println(1.smallerValue(5))
    println(1 smallerValue 5)

}

infix fun Int.smallerValue(a:Int):Int=if(a<this)a else this;

// Infix fn can be a member fn or extension fn.
// They have a **SINGLE parameter**
// They have a prefix of "infix"