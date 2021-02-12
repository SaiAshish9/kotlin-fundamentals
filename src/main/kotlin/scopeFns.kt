fun main() {

//    with
    val p = Person5()
    println(p.age)
    println(p.name)
    with(p){
        println(name)
    }
    var ageAfterFiveYears:Int = with(p){
        println(name)
        age +5
    }
    var ageAfterFiveYears1:String = with(p){
        println(name)
        age +5
        "hi"
    }
    println("$ageAfterFiveYears")

//    let
    val p1 = Person5().apply {
        name = "Sai"
        age = 19
    }

    with(p1){

    }

    var numbersList: MutableList<Int> = mutableListOf(1,2,3)
    println(numbersList)


    numbersList.also {
        it.add(8)
        println(numbersList)
        it.remove(8)
    }

     p1.also {
       it.name="hi"
       println("op")
     }

    val name:String? = null


    val stringLength = name?.let {
        println(it!!.reversed())
//    null pointer exception will be thrown and program will be crashed
//    if let keyword is not used
        println(it.capitalize())
        println(it.length)
        it.length
    }
    print(stringLength)

    var p2:Person5? = null

    var x = p2?.run{
        println(name)
        println(age)
        "hi"
    }

// run is a combination of let and with

}

class Person5{
    var name:String = "Sai Ashish"
    var age:Int = 27
}

// let,run,with,also,apply




//with
//Return : lambda result
//Context Object : this

//let
//Return : lambda result
//Context Object : it

//run
//Return : lambda result
//Context Object : this

//apply
//Return : context object
//Context Object : this

//also
//Return : context object
//Context Object : it



