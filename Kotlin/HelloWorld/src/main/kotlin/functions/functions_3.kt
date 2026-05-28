package functions

fun main() {
    println("sum is ${sum(12, 2, 3, 4, 23, 234, 23546, 45, 323, 4325, 3546, 34212)}")
}

fun sum(vararg numbers: Int) : Int{ //vararg is used to take multiple inputs from a single function
    //Sending it as a function pointer to the actual data from the sum.
    printNum(*numbers)
    var result = 0
    
    for (number in numbers){
        result+= number
    }
    return result
}

fun printNum(vararg numbers : Int){
    //Iteration through each and every number.
    numbers.forEach { print("$it,") }
    println()
}
