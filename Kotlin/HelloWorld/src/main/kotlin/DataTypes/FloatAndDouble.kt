package DataTypes

// Float number store the decimal point value also unlike integer which has whole numbers and negative numbers.
// We need to add F at the end of the value so declare it as float value (32 bit value)
// generally Float are used in memory efficent application
// So with F the compiler thinks it is a Double so type mismatch.
fun main(){
    val myNumber: Float = 2.05F
    val myNumber1 = 2.5F // Similar to above instruction.

    println("myNumber:$myNumber and myNumber_1:$myNumber1")

// Double number stores more decimal point numbers (64 bit value)
// Without double the compile by default take the point value as double so need to declare it as Double.
    val mySecond: Double = 2.0
    val mySecond1 = 2.0 // Similar to above instruction.

    println("mySecond:$mySecond and mySecond1:$mySecond1")
}
