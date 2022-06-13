import java.io.FileWriter

fun main() {
    print("Write text to file:")
    val str:String = readLine().toString()
    writeToFile(str)
}

fun writeToFile(str:String) {
    try {
        val fo = FileWriter("example.txt", true)
        fo.write(str + "\n")
        fo.close()
    } catch (ex:Exception) {
        println(ex.message)
    }
}