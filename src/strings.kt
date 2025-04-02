// "content" : strings to store text
// string contains a collection of characters surrounded by
// double quotes
var txt = "Hello Word"
var firstname = "Fredrick"
var lastname = "Muthomi"
fun main(){
      // accessing a character in a string
    println(txt[4])
    // getting the length of the string
    println(txt.length)
    println(txt.uppercase())
    println(txt.lowercase())
    var fullname = "My Name is " + firstname + " " + lastname
    println(fullname)
    println("My name is $firstname $lastname")
}
