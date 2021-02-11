fun main() {

    var student = Student("Ashish")
    student.name = "Sai Ashish"
    print(student.name)

}

// class Student constructor(name:String)

//class Student(_name: String)  {
//    var name:String = "sai"
//
//    init{
//        println(_name)
//        this.name = _name
//    }
//}


class Student(var name: String){

    init {
        println(name)
    }
}