@file:JvmName("Inter1")

//Inter.class

fun main(args: Array<String>) {

}

fun add1(a: Int, b: Int): Int{
    return a + b
}

// we can call java functions from kotlin and kotlin functions from java
// we can have java and kotlin files within the same project

// In java , a.java file is convrted into a.class
// In Kotlin , a.kt file is converted into AKt.class

// a.kt
// fun add(a:Int):Boolean = true

// AKt.class
// class AKt{
// public static Boolean add(int a){
// }