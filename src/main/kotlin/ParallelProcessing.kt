fun main() {
    var t1 = thread("thread1")
    t1.start()
    var t2 = thread("thread2")
    t2.start()
    var t3 = thread("thread3")
    t3.start()
    println("main thread before join")
    t3.join()
    println("main thread after join")
}


class thread(var t:String?=null) : Thread() {
    init {
        println("$t started")
    }
    override fun run() {
        var count = 0
        while (count < 3) {
            println("$t Count: $count")
            count++
            try {
                Thread.sleep(1000)
            } catch (ex: Exception) {
            }
        }
    }
}

//thread1 started
//thread2 started
//thread1 Count: 0
//thread3 started
//thread2 Count: 0
//main thread before join
//thread3 Count: 0
//thread1 Count: 1
//thread2 Count: 1
//thread3 Count: 1
//thread1 Count: 2
//thread2 Count: 2
//thread3 Count: 2
//main thread after join
