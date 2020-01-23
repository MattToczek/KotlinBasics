fun main(args : Array<String>){

// Kotlin tries to protect from null assignments

//    cannot assign null to
//    var nullVal: String = null

//  can with ? annotation
    var nullVal: String? = null

    fun returnNull() : String?{
        return null
    }

//  if protected by an if statement, function can return null
    var nullVal2 = returnNull()

    if (nullVal2 != null){
        println(nullVal2.length)
    }

//  !! -> force operator and can force a null value
    var nullVal3 = nullVal2!!.length

//  elvis operator ( ? ) allows for a default value to be set, in case of null
    var nullVal4: String = returnNull() ?: "No Name"
}