
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

    println("A is a Char: ${letter is Char}")

}
