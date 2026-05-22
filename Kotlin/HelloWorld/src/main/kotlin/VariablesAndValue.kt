fun main()
{
    // Keyword var is used to define Variable
    //var <variable_name> : <type> = <data>
    // <type> String,Int
    var userName : String = "Hanoch"
    var age : Int = 50
    // Assigning the value.
    userName = "Gandam"
    age = 22
    // Assigning other than string gives error. As the <type> is string but the value is number or int.
    // So variables are STATICALLY TYPED
    //userName = 5 //uncomment it to verify
    //age = "Hanoch" //uncomment it to verify
    // to print a variable use $<variable_name> to print the variable.
    println("Hello $userName, your age is $age")


    // Keyword val is used to create a constant values, assigned at the starting of the program
    // Val is VALUE i.e, Read-Only
    val name : String = "Hanoch"
    //We cannot change the value of the val variables they are constant
    //name = "Gandam" //uncomment it to verify
    println("Hello $name")

    //We dont need to always specify the <type> of the variable
    // We can assign the value based on the value it is called TYPE INFERENCE
    // And works similarly to completed assigned type variable.
    var dogName = "Happy"
    println("My dog name is $dogName")
}