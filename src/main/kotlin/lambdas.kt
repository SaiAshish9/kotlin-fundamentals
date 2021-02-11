fun main(args:Array<String>) {
    val p = P()
    p.addTwoNumbers(1,2)
    p.addTwoNumbers(1,2,object: MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })
    val test:String = "Hello"
    val myLambda : (Int) -> Unit = {
      s:Int -> println(s)
    }
    p.addTwoNumbers(2,7,myLambda)
//    val myLambda = {s:Int => println(s)}
}

class P{
    fun addTwoNumbers(a:Int,b:Int,action:MyInterface){
        val sum = a+b
        action.execute(sum)
        println(sum)
    }
    fun addTwoNumbers(a:Int,b:Int,action: (Int)->Unit){
        val sum = a+b
        action(sum)
        println(sum)
    }
    fun addTwoNumbers(a:Int,b:Int){
        val sum = a+b
        println(sum)
    }
}

interface MyInterface{
    fun execute(sum:Int)
}


// high level functions can accept functions as parameters
// can return a function
// or can do both

// lambdas
// It is just a function with no name