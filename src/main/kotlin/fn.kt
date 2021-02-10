
fun main(args:Array<String>){
//    var x:String;
//    x="sai ashish";
    var person = Person();
//    personObj.display(x);
    person.name ="abcd";
    person.display(person.name)
}

class Person{

    var name:String = ""

    fun display(name: String){
        print(name)
    }
}

