
fun main() {



}

open abstract class Per{

    abstract var name:String
    abstract fun eat()

//    abstract variables and methods are just defined

    open fun getHeight(){}
//  ready to be overridden

    fun goToSchool(){}
//  public & final by default

}

class India:Per(){

    override var name:String ="sai"

    override fun eat(){

    }

    override fun getHeight(){

    }

}

