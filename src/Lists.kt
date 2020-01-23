import javax.management.ImmutableDescriptor

fun main(args : Array<String>) {

    var list1 : MutableList<Int> = mutableListOf(1,2,3,4,5)

    val list2 : List<Int> = listOf(1,3,5,9)

//  adds value to mutable list
    list1.add(6)

    println(list1)

    println("first item: ${list1.first()}")
    println("last item: ${list1.last()}")

    println("2nd item: ${list1[2]}")

    var list3 = list1.subList(0, 3)

//  clears all items in list
    list3.clear()

//  removes defined item
    list1.remove(1)

//  removes item at given index
    list1.removeAt(1)

//  amends item at index
    list1[1] = 10



}