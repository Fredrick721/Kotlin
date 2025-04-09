// allows to repeat tasks
// collection of data
// in kotlin for loop (used when we have

fun main(){
    // for loop
    for( i in 1..5){
        println(i)
    }
    // adding step
    for (i in 1..10 step 2){
        println(i)
    }
    // iterate down
    for (i in 5 downTo 1){
        println(i)
    }
    // iterate over collection
    val fruits = listOf("Apple","Banana","Cherry")
    for(i in fruits){
        converttoUpper(i)
        println(i)
    }
    // print with index
    for ((index,fruit) in fruits.withIndex()){
        println("$index :: $fruits")
    }
    var i = 1
    while (i <= 5){
        println(i)
        i++
    }
    var j = 1
    do {
        println(j)
        j++
    } while (j<=5)
    // NESTED LOOP : a loop inside a loop
    // for every iteration of outer loop the inner loop must complete its set
    for (i in 1..3){
        println("$i : outer loop")
        for (j in 1..3){
            println("$j : inner loop")
        }
    }
     // loop control statements : break, continue
    // labels(outer and inner)
    for (i in 1..5){
        if (i == 5){
            break
        }
        println(i)
    }
    for (i in 1..10){
        if (i == 5){
            continue
        }
        println(i)
    }
    // label statements outer and inner
 outer@   for (i in 1..3){
    inner@ for (j in 1..  3){
            if (i == 2 && j == 2){
                break@outer
            }
        println("i=$i, j=$j")
        }
            continue
        }
    val numbers = listOf(1,2,3,4)
    val names = listOf("Ryan","Munyi","Phenny")
    numbers.forEach{
        println("$it")
    }
    names.forEach {
        converttoUpper(it)
    }


}
fun converttoUpper(i: String) {
    println(i.uppercase())
}