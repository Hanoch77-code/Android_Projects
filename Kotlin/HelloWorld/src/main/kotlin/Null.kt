fun main()
{
    var text : String? = null // we need to keep '?' at the end of the type to assign null to a variable.
    println(text)

    var text1 : String? = "Name"
    // We cannot view string size without a conditional statements. So prevent any runtime error's.
    //text1 =  null //uncomment to verify the results
    if(text1 != null)
    {
        println(text1.length)
    }
    else
    {
        println("The variable is null.")
    }
    // In simple way the above functionality can be done as follows.
    println(text1?.length) // By putting '?.' this is safe call operator in this case and print null if there is a null.
    // In this another method we can check it forcefully as follows.
    println(text1!!.length) // By putting '!!.' this force it to run the length, but generally we get a null pointer exception when there is a null value.
    // Null pointer exception occurs when there is a function trying to point to a null value and tries to use it. And program breaks.
    //text1 =  null //uncomment to verify the results
    // ELVIS OPERATOR
    val text2 = text1 ?: "This variable is null" // When the variable is null it prints the text on the right side or else return the same value.
    println(text2)

}