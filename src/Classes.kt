fun main(args : Array<String>){

//  don't use 'new' keyword to initialise class instance
    val bowser = Animal("Bowser", 20.0, 13.5)

    bowser.getInfo()

    val spot = Dog("Spot", 20.0, 14.5, "Johny")
    spot.getInfo()

    val tweety = Bird("Tweety", true)
    tweety.fly(20.5)

    val ostrich = Bird("Ostrich", false)
//  nothing comes out
    ostrich.fly(10.0)
}

//no static classes in Kotlin and classes are final, unless marked with "open"
open class Animal(val name: String,
                  var height: Double,
                  var weight: Double){
//  initialisation of value
    init{
//      regex defines something for a rule
        val regex = Regex(".*\\d+.*")

//      require sets a rule - in this case that name cannot contain a number
        require(!name.matches(regex)){"Animal name can't contain numbers!"}

//      requires weight and height to be higher than 0
        require(weight >0) {"Weight must be grater than 0!"}
        require(height >0) {"Height must be grater than 0!"}

    }

    open fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight.")
    }
}

// child class is defined differently
class Dog(name:String,
          height: Double,
          weight: Double,
          var owner: String) : Animal(name, height, weight){

//  override annotation doesn't have @ sign
    override fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight and is owned by $owner.")
    }
}

// Bird implements the interface flyable
class Bird constructor(var name :String,
                       override var flies: Boolean = true ) : Flyable{
    override fun fly(distMile: Double): Unit {
        if(flies){
            println("$name flies $distMile miles.")
        }
    }
}

// interfaces can be used similarly to Java to define requires methods
interface Flyable{
    var flies: Boolean
    fun fly(distMile: Double) : Unit
}