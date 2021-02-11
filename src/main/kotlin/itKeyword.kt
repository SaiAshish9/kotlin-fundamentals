
fun main(args: Array<String>) {
    val p = Prog()
    p.reverseAndDisplay("abcd", {
        it.reversed()
    })
}

class Prog {
    fun reverseAndDisplay(str: String,myFunc : (String)->String) {
        var res= myFunc(str)
        println(res)
    }
}