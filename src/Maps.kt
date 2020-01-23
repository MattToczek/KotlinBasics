fun main(args : Array<String>){

//  maps work like containers for key value pairs - much like JSON objects
    val map = mutableMapOf<Int, Any?> ()

    val map2 = mutableMapOf(1 to "Doug", 2 to 25)

    map[1] = "Derek"

    map[2] = 42

    println("Map Size : ${map.size}")

    map.put(3, "Pittsburgh")

    map.remove(2)

    println(map)
    println(map2)

    for((x,y)in map){
        println("Key: $x Value: $y")
    }
}