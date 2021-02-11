fun main() {

    var a = Ind()
    a.eat()
    a.sleep()

}

interface Per2{

 var name:String
 fun eat()

 fun sleep(){

 }

//    need not to be overridden
//    if only one interface is present

// everything declared inside interface is abstract and open by default

}

interface Per3{

    fun sleep(){

    }

}

// Interface can contain both normal & abstract methods but they contain only abstract property

class Ind:Per2{
//    override var name: String
//        get() = TODO("Not yet implemented")
//        set(value) {}
    override var name:String = "dummy"

    override fun eat() {

    }

}

class B:Per2,Per3{
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun eat() {

    }

    override fun sleep() {
        super<Per3>.sleep()
    }

}