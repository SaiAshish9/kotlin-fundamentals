
fun main() {

    var st = St("Sai")
    var st1 = St("Ashish",10)
    println(st.id)

}

class St(var name: String){

    var id:Int = -1

    init {

    }

//    init block as a part of primary constructor.
//    var on the secondary constructor is not allowed

    constructor(n: String,id:Int):this(n){
        this.id = id
    }

}