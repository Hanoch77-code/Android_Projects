package functions

fun main() {
    // Giving no inputs
    sendMessage()
    // Giving one input, and it will always be the first input to the function.
    sendMessage("Hanoch")
    // Giving two inputs
    sendMessage("Hanoch","Hello Everyone")
    //Giving two input in customized order by using the following format.
    sendMessage(message = "Hey How are you", name = "Hanoch")
}
//Sending Data and Setting Default data for a function.
// If we don't know whether data will be sent to a fun or not we use default value assigned when nothing is sent.
//              normal datatype assignment    function in function
fun sendMessage(name: String = "User",message: String = noText())
{
    println("Name = $name : $message")
}

fun noText()= "No Message"