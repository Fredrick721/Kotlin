// are reusable blocks of code that perform specific functions
// simple function / named function

fun greet(){
    println("Hello from the named function")
}
// function with parameters
fun greet_with_params(name: String){
    name.uppercase()
    println("hello from params function : $name")
}
// function with return value
fun add(a: Int, b: Int): Int {
    return a + b
}
// function with default arguments
fun subtract(a: Int = 10, b: Int = 10): Int{
    return b - a
}


fun main(){
    greet()
    greet_with_params("Ryan")
    greet_with_params("Phenny")
    val sum = add(5,3)
    println(sum)
    val diff = subtract(3,6)
    println(diff)
}