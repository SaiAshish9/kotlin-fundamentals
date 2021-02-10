
fun main() {

  val str1:String = "a"
  val str2:String = "b"
  val str3:String = "Hey,"

  println(6.greaterValue(8));
  println(str3.add(str1,str2))

}

fun String.add(s1:String,s2:String):String{
    return this + s1 + s2
}

fun Int.greaterValue(other:Int):Int{
  if(this>other){
      return this
  }else{
      return other
  }
}

// Concept

//fun main() {
//    var student=Student()
//    println(student.hasPassed(40))
//    println(student.isScholar(57))
//}
//
//fun Student.isScholar(marks: Int): Boolean{
//    return marks > 95
//}
//
//class Student{
//    fun hasPassed(marks:Int):Boolean {
//        return marks>40
//    }
//}

// Extension Functions
// Adds new function to the classes
// can "add" functions to a class without changing it

// new fns added behaves like static