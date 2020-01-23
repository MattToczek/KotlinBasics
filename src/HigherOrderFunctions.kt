import java.lang.IllegalArgumentException

fun main(args: Array<String>) {

    val numList = 1..20

//  filter returns a list that has been filtered in the way specified
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach{n -> println(n)}

//  collection operators - work on lists, arrays, maps etc.
    val numList3 = 1..20

//  reduce adds all numbers together
    val listSum = numList3.reduce{x, y -> x + y}
    println("reduce: listSum on numList3 = $listSum")

//  fold adds all numbers together but takes an initial value (in this case 5)
    val listSum2 = numList3.fold(5) {x, y -> x + y}
    println("fold: listSum on numList3 = $listSum2")

//  checks if a list contains any even numbers
    val evenChecker = numList3.any { it %2 == 0 }
    println("Evens in list? : $evenChecker")

//  checks if all list is even numbers
    val allEvenChecker = numList3.all { it %2 == 0 }
    println("All evens in list? : $allEvenChecker")

//  filters a list for values above 15
    val biggerThan3 = numList3.filter{it > 15}
    biggerThan3.forEach{n -> println(">15 : $n")}

//  map iterates through items and applies action specified
    val times7 = numList3.map {it * 7}
    times7.forEach{n -> println("times 7 : $n")}

//  try catch allows exception to be specified and thrown from catch
    val divisor = 2
    try {
        if(divisor == 0) {
            throw IllegalArgumentException("Can't divide by 0")
        }else{
            println("5 / $divisor = $ ${5/divisor}")
        }
    } catch(e: IllegalArgumentException){
        println("${e.message}")
    }

//  1. declare function with num1 defined
    val mult3 = makeMathFunction(3)

//   use resulting function to times number by (in this case) 3
    println("5 * 3 = ${mult3(5)}")

//  2. function to times Int by 2
    val multiply2 = {num1: Int -> num1 * 2}

//  array
    val numList2 = arrayOf(1,2,3,4,5)

//  iterates through array and applies func to each
    mathOnList(numList2, multiply2)
}

// 1. passes a function to a function
fun makeMathFunction(num1: Int): (Int) -> Int = {
    num2 -> num1 * num2
}

// 2. pass in an array and a function and it applies function to each of the array
fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int){
    for(num in numList){
        println("MathOnList ${myFunc(num)}")
    }
}