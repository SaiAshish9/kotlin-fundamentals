
val pi:Float by lazy {
    3.14f
}
    fun main() {

        var area1 = pi * 4 * 4
        println(area1)

    }


// lazy is thread safe and was designed to prevent
// unnecessary initialization of objects
