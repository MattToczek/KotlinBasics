// interface declaration
interface Signatory {
//  obligatory method with no args or method
    fun sign()
}

// interfaces implemented by class using ":"
class Person : Signatory {
//  no annotation (@) needed in Kotlin
    override fun sign() {
        println("I can sign documents!")
    }
}