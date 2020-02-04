interface Signatory {
    fun sign()
}

class Person : Signatory {
    override fun sign() {
        println("I can sign documents!")
    }
}