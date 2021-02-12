fun main() {
   val myNumbers: List<Int> = listOf(9,8,6,0,12)
   val mySmallNums = myNumbers.filter {
//       v -> v < 10
       it < 10
   }
   for (num in mySmallNums){
       println(num)
   }
   val mySquareNums = mySmallNums.map { it * it }
//    x -> x * x
    for (num in mySquareNums){
       println(num)
   }

    var x = myNumbers.filter { it < 10 }
        .map { it * it }

    for (num in x){
        println(num)
    }

    var people = listOf<Person4>(
        Person4(1,"Sai"),
        Person4(2,"Ashish")
    )
    for(name in people){
        println(name)
    }
    var check1= myNumbers.all{ it > 10 }
    println(check1)
    var check2 = myNumbers.any{ it < 10 }
    println(check2)
    var totalCount = myNumbers.count {it > 10}
    println(totalCount)
    println(myNumbers.find { it>10 })

    var myPredicate = {num:Int -> num > 10}

    check1 = myNumbers.all(myPredicate)
    check2 = myNumbers.any(myPredicate)
    totalCount = myNumbers.count(myPredicate)
    println(myNumbers.find(myPredicate))




}

class Person4(var age:Int,var name: String){

}



// filter,map,
// predicates -> return either true or false
// all any count
// find
// flatmap distinct