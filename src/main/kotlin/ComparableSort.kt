import java.util.*
import kotlin.collections.ArrayList

class Person12(var n: String,var age:Int):Comparable<Person12>{

    override fun compareTo(other: Person12): Int {
        return this.age - other.age
    }

}
fun main(){
    var list= ArrayList<String>()
    list.add("b")
    list.add("a")
    for(n in list){
        println(n)
    }
    Collections.sort(list)
    for(n in list){
        println(n)
    }
    var list1 = ArrayList<Person12>()
    list1.add(Person12("a",1))
    list1.add(Person12("b",2))
    for(n in list1){
        println("${n.age} - ${n.n}")
    }
}