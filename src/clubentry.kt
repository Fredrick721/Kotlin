fun main() {
    println("Welcome to the club entry system")
    print("Enter your age: ")
    val age= readln(). toIntOrNull() ?: 0
    if (age  <= 18){
        println("Sorry but you are too young to enter the club.")
        if (age >= 18){
            println("Welcome to the club. How may we assist you?")
        }
    }
    print("Do you have a vip pass(yes/no) ")
    val hasVipPass = readln().equals("yes", ignoreCase = true)

    if (hasVipPass){
        println("Welcome to the club.You have access to our Vip lounge.")
    }
    else{
        println(" Kindly enter your member number: ")

    }
    print("Are you a member? *yes/no) ")
    val isMember = readln().equals("yes", ignoreCase = true)

    if (isMember){
        println("")
    }
    var memberNumber = 0
    val mumberNumber= readln()
    println("Membership confirmed. Member number: $mumberNumber")

    println(age)
    println(hasVipPass)
    println(isMember)
}