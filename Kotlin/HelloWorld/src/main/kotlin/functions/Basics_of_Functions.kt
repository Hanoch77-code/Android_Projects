package functions

fun main()
{
    sayHello()
    sayHello("Hanoch",18)
    println(getMax(10,20))
    println(getMaxOp(10,20))
    println(getMax(10.5,20.7))
    println(getMax(10,20,40))
}
///// Function Overloading, Is a process in which multiple functions of same name but different input arguments are with
///// Same function name but different arguments.
// Basic Function with no Input Arguments and No return values.
fun sayHello()
{
    println("Hello !")
}
// Basic Function with Input Arguments and No return values.
fun sayHello(Name : String,Age : Int)
{
    println("Hello, $Name ! You are $Age old")
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         inputs         return type
fun getMax(a: Int,b: Int): Int {
    if(a>b)
    {
        return a
    }
    else {
        return b
    }
}
fun getMax(a: Double,b: Double) = if(a>b) a else b
fun getMax(a: Int,b: Int,c: Int) : Int{
    if(a >= b && a >= c){
        return a
    }else if(b >= a && b >= c){
        return b
    }
    else{
        return c
    }
}
fun getMaxOp(a: Int,b: Int) = if (a>b)  a else b