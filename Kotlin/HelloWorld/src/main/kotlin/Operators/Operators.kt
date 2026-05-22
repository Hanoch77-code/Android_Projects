package Operators

fun main()
{
    var x = 5
    val y = 3.0

    // Externally storing the value of the result and then printing
    var result = x+y //Addition
    println("result:$result") // Printing the result

    // Doing operations in print function. Expression Evaluation and function Nesting.
    println("X + Y = ${x+y}") // Addition operation
    println("X - Y = ${x-y}") // Subtraction Operation
    println("X * Y = ${x*y}") // Multiplication Operation
    println("X / Y = ${x/y}") // Division Operation
    println("X % Y = ${x%y}") // Modulus Operation

    result = x+y //Addition
    println("result:$result")

    result += 2
    println("result:$result")

    result -= 2
    println("result:$result")

    result *= 2
    println("result:$result")

    result /= 2
    println("result:$result")

    result %= 2
    println("result:$result")

    x = 0
    // Incrementation Operation
    println("x++ = ${x++}") // Return the pre-existing value and then increments
    println("Incremented X : $x") // Incremented Value
    println("++x = ${++x}") // Increments first, then returns the value.

    // Decrementation Operation
    println("x-- = ${x--}") // Return the pre-existing value and then Decrements
    println("Incremented X : $x") // Decremented Value
    println("--x = ${--x}") // Decrements first, then returns the value.


}