fun main() {
    val t1 = MyThread("First")
    t1.start()
    val t2 = MyThread("Second")
    t2.start()
    val t3 = MyThread("Third")
    t3.start()
    t3.join()
    println("Start thread")
}

class MyThread:Thread {
    private var threadName:String = ""
    constructor(threadName: String):super() {
        this.threadName = threadName
        println("$threadName is started")
    }
    override fun run() {
        var count = 0
        while (count < 10) {
            println("$threadName Count: $count")
            count++
            try {
                sleep(500)
            }catch (ex:Exception) {
                print(ex.message)
            }
        }
    }
}