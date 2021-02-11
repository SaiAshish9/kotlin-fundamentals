fun main(args:Array<String>) {
    val p = P()
    var result = 0

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

//    High Level Functions
    val myLambdaFunc: (Int,Int) -> Int = {x,y -> x+y}

//    p.addTwoNumbers(3,4,myLambdaFunc)
    p.addTwoNumbers(7,8){x,y -> x+y}

    p.addTwoNumbers(7,8){
        x,y-> {
            result = x+y
    }

    }


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
    fun addTwoNumbers(a:Int,b:Int,myFunc:(Int,Int)->Unit){
        println(myFunc(a,b))
    }



}

// Closures

// In java 8 , we cannot mutate(change) values of
// outside variable inside Lambdas
// But in Kotlin we can change the values



interface MyInterface{
    fun execute(sum:Int)
}


// high level functions can accept functions as parameters
// can return a function
// or can do both

// lambdas
// It is just a function with no name