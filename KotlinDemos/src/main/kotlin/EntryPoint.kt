import com.example.mbk.*
import java.util.*

class Singleton {
    var name:String? = null
    constructor() {
        println("instance is created")
    }
    companion object {
        val instance:Singleton by lazy { Singleton() }
    }
}

class Person(var name:String, var age:Int): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }
}

fun main(args: Array<String>) {
//    val geeks = listOf(Person("Fowler", 23), Person("Beck", 2), Person("Evans", 33))
//    println("Before sort")
//    for (name in geeks) {
//        println("Name: ${name.name} Age: ${name.age}")
//    }
//    Collections.sort(geeks)
//    println("After sort")
//    for (name in geeks) {
//        println("Name: ${name.name} Age: ${name.age}")
//    }
    isOddOrEven()
}

fun isOddOrEven() {
    print("Enter number:")
    var number = readLine()!!.toInt()
    val result = if (number % 2 == 0) "Number is even" else "Number is odd"
    println(result)
}