@file:JvmName("DefaultArgs")

fun main() {
  print(vol(10,20))
}

@JvmOverloads
fun vol(a:Int,b:Int,c:Int=10):Int{
    return a*b*c
}