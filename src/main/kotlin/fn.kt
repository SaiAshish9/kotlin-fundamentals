import com.programming.Person

fun main(args:Array<String>){
//    var x:String;
//    x="sai ashish";
    var person = Person();
//    personObj.display(x);
    person.name ="abcd";
    person.display(person.name)
    print("name: ${person.name}")
}
