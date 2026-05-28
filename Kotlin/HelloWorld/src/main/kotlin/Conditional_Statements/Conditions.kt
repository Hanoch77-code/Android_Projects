package Conditional_Statements

fun main()
{
    val num1 = 5
    val num2 = 6

    // Single Variable Condition Comparison with a Constant.
    //If Else Block
    if(num1 > 0) // '>' greater than comparator. Similar comparators are given below.
    {
        println("The Condition($num1 > 0) is TRUE")
    }
    else
    {
        println("The Condition($num1 > 0) is FALSE")
    }
    //Comparator Operators
    // 1. '>' greater than
    // 2. '<' less than
    // 3. '>=' greater than or equal to
    // 4. '<=' less than or equal to
    // 5. '==' Equal to


    // Two Variable Condition Comparison with one another.
    //If Else Block
    if(num1 > num2)
    {
        println("The Condition($num1 > 0) is TRUE")
    }
    else
    {
        println("The Condition($num1 > 0) is FALSE")
    }

    // Two Variable Condition Comparison with a Multiple or One Constant.
    //If Else Block
    if(num1 > 0 || num2 >0) // '||' is a OR operation. Similar Operations that can be used are listed below.
    {
        println("The Condition is TRUE")
    }
    else
    {
        println("The Condition is FALSE")
    }
    // Comparison OPERATORS
    // 1. '||' - OR (Condition is True if anyone condition is TRUE)
    // 2. '&&' - AND (Condition is True if all conditions are TRUE)
    // 3. '!'  - NOT (COndition is Used if the actual condition is FALSE and we want it to TRUE, so it inverts the output)

    /// Example for not operation
    if(!(num1 > num2))
    {
        println("The Condition(($num1 > 0)) is actually FALSE but for 'if' it is TRUE")
    }
    else
    {
        println("The Condition(($num1 > 0)) is actually TRUE but for 'if' it is FALSE")
    }

    // Conditional Storing of Values to Variables
    // Two Variable Condition Comparison with a Multiple or One Constant.
    //If Else Block
    val text = if(num1 > 0 || num2 >0) // '||' is a OR operation.
    {
        println("The Condition is TRUE")
        "Here it is a Happy"
    }
    else
    {
        println("The Condition is FALSE")
        5 // We can specify any output type. One can be string and integer
    }
    println(text)

    //Multiple Condition Check.
    if(num1 > num2) {
        println("The condition($num1 > $num2) is TRUE")
    }
    else if (num1 < num2){
        println("The condition($num1 < $num2) is TRUE")
    }
    else if (num1 == num2)
    {
        println("The condition($num1 == $num2) is TRUE")
    }
    else
    {
        println("The conditions are FALSE")
    }
    


}