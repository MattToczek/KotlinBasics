import java.util.*

fun main(args : Array<String>){
    println("Hello world!")

//  val = immutable (constant)
    val name = "Matt"

//  var = mutable (variable)
    var myAge = 29

//  : allows us to declare the data type
    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

//  can concatenate, or interpolate
    println("Biggest Int: " + bigInt)
    println("Smallest Int: $smallInt")

// also have Floats, Longs, Doubles etc.

    var dblNum1: Double = 1.1111111111111111
    var dblNum2: Double = 1.1111111111111111

    println("Sum: " + (dblNum1 + dblNum2))
//  if maximum length of data type is reached (16 for Double) accuracy lost:
//  output = Sum: 2.2222222222222223

//  'is' key word check type of value
    if(true is Boolean){
        println("True is a Boolean value")
    }

    var letter: Char = 'A'

//  can do in-line functions
    println("A is a Char: ${letter is Char}")

//  casting between data types
    println("3.14 to Int: " + (3.14.toInt()))
    println("Char (A) to Int: " + letter.toInt())
    println("90 to Char: " + 90.toChar())

    val longStr = """This is a 
        |multi line 
        |string 
        |with triple speech
|marks
    """.trimMargin()

    println(longStr)

    var str1 = "a random string"
    var str2 = "A Random String"

//  False
    println("Strings Equal: ${str1.equals(str2)}")

//  1 or -1 depending => this returns -1
    println("Compare A to B: ${"a".compareTo("b")}")

//  strings can be treated as arrays
    println("2nd Index: ${str1[2]}")
//  can also use ${str1.get(2)} to get the same result

    println("Index 2-7: ${str1.subSequence(2,8)}")

    println("Contains random: ${str1.contains("random")}")

//  arrays can take any type of value, including mixed
    var myArr = arrayOf(1, 1.23, "Matt")

//  .size gives length
    println("Array Length: ${myArr.size}")

//  make a copy of a subset of an array with .copyOfRange(index1, index2)
    var partArr = myArr.copyOfRange(0, 1)

//  lambda function inside {} is saying that each value is squared (x * x)
    var sqArray = Array(5, {x -> x * x})

//  output => 4
    println(sqArray[2])

//  set value type array
    var arr2: Array<Int> = arrayOf(1,2,3)

//  generates consecutive numbers between
    val oneTo10 = 1..10

//  similar with letters
    val alpha = "A".."Z"

    println("R in Alpha: ${"R" in alpha}")

//  reverse array
    val tenToOne = 10.downTo(1)

//  returns an array between 2 values
    val twoTo20 = 2.rangeTo(20)

//  increments of 3
    val rng3 = oneTo10.step(3)

    for(x in rng3) print("rng3: $x      ")
    println()

    for(x in tenToOne.reversed()) print("Reverse: $x      ")
    println()

    var age = 2;

    // when works like switch
    when(age) {
//      can pass in lists
        0,1,2,3 -> println("Go to nursery")

//      values
        4 -> println("Go to reception")

//      ranges
        in 5..11 -> {
            val year = age - 3
            println("Go to year $year")
        }
        else -> println("Uni, College or Job?")
    }

//  for loop
    for(x in 1..10){
        println("Loop: $x")
    }

//  can import any Java library to Kotlin - java.util.Random in this instance
    val rand = Random()

//  generates number from 1-10
    val magicNum = rand.nextInt(10) + 1

//  setting up a scanner for input
    val input = Scanner(System.`in`)
    var guess = 0

//  while loop
//    while(guess != magicNum) {
//        println("Guess a number between 1-10")
//        guess = input.nextInt()
//    }

    println("Well done! The Magic Number was: $guess")

    for(x in 1..20){
        if(x % 2 == 0) {
            //  continue ignores the rest of code below and moves on to next loop
            continue
        }

        println("Odd: $x")

//      break finishes loops
        if(x == 15) break
    }

    var arr3: Array<Int> = arrayOf(3,6,9)

    for(i in arr3.indices){
        println("Multiples of 3: ${arr3[i]}")
    }

//    can use brackets in for loop (i, value)
    for((index, value)in arr3.withIndex()){
        println("Index: $index Value: $value")
    }

//  simple function - 3rd Int       VVV = return type
    fun add(num1: Int, num2: Int) : Int = num1 + num2
    println("5 + 4 = ${add(5,4)}")

    //  doesn't need return type
//    can add default parameter values
    fun subtract(num1: Int = 3, num2: Int = 2) = num1 - num2
    println("5 - 4 = ${subtract(5,4)}")

//    can use named parameter to enter parameter in a different order
    println("4 - 5 = ${subtract( num2=5, num1=4)}")

//    Unit keyword replaces void as no return in methods
    fun sayHello(name: String): Unit = println( "Hi $name")
}

//https://www.youtube.com/watch?v=H_oGi8uuDpA