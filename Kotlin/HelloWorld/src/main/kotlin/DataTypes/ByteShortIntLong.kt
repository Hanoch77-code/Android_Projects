package DataTypes

fun main()
{
    // To print the maximum and minimum value of Int type
    val integerMax = Int.MAX_VALUE
    val integerMin = Int.MIN_VALUE

    println("Max value of Int is: $integerMax") //  2147483647
    println("Min value of Int is: $integerMin") // -2147483648

    // To print the maximum and minimum value of Byte type
    val byteMax = Byte.MAX_VALUE
    val byteMin = Byte.MIN_VALUE

    println("Max value of Byte is: $byteMax") //  127
    println("Min value of Byte is: $byteMin") // -128

    // To print the maximum and minimum value of Short type
    val shortMax = Short.MAX_VALUE
    val shortMin = Short.MIN_VALUE

    println("Max value of Short is: $shortMax") //  32767
    println("Min value of Short is: $shortMin") // -32768

    // To print the maximum and minimum value of Long type
    val longMax = Long.MAX_VALUE
    val longMin = Long.MIN_VALUE

    println("Max value of Long is: $longMax") //  9223372036854775807
    println("Min value of Long is: $longMin") // -9223372036854775808

    // trick to declare the long is
    var my_number = 89L //Use Capital 'L'
    println("printing the my_number :$my_number")
}