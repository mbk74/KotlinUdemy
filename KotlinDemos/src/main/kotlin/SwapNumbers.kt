fun swapNumbers() {
    print("Enter number1: ")
    var number1 = readLine()!!.toInt()

    print("Enter number2: ")
    var number2 = readLine()!!.toInt()

//    val temp = number1
//    number1 = number2
//    number2 = temp
    number1 = number2.also { number2 = number1 }
    println("Swap numbers is--> Number1: $number1, Number2: $number2")
}

fun oddOrEven (){
    print("Enter number: ")
    var number = readLine()!!.toInt()
    val res = if (number % 2 == 0) "Even" else "Odd"
    println("Number is $res")
}

fun oddOrEvenList (){
    for (i in 2..100 step 2) {
        print("$i ")
    }
}
class MyNumbers{
    init {

    }
}