@file:JvmName("NamedParams")

fun main() {
  findVolune(a=2,c=10)
}

@JvmOverloads
fun findVolune(a:Int,b:Int=1,c:Int=10){
  println(a*b*c)
}