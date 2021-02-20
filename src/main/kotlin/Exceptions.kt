fun main() {
    try{
        var n2:Int = readLine()!!.toInt()
        println(100/n2)
    }catch(ex:Exception){
      println(ex.message)
    }
}