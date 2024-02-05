package assessment_1.collection

fun main(){

    /*
    b. Create a program perform basic operations(Add, remove, Update, copy...)
    on mutable and unmutable list, map, and set
     */

    //-------------------------------------------Mutable list,set,map operation---------------------------------
    var list= mutableListOf("akash","singh")
    // Add operation in mutable list
    list.add("kumar")
    // Remove operation in mutable list
    list.removeAt(0)
    for(name in list){
        println(name)
    }
    // Copy operation in mutable list
    val list2 = ArrayList(list)
    println("Copied List of $list2")
    println("-------------------------------")

    var set= mutableSetOf<Int>(1,2,3)
    // Add operation in Mutable Set
    set.add(4)
    // remove operation in Mutable Set
    set.remove(0)
    for(item in set){
        println(item)
    }
    // Copy operation in Mutable Set
    val mutableSetCopy = mutableSet.toSet()
    println(mutableSetCopy)

    println("-------------------------------")

    var map= mutableMapOf<Int,String>(1 to "akash",2 to "singh")
    // Add operation in Mutable map
    map.put(3,"kumar")
    // Remove operation in Mutable map
    map.remove(1)
    for (name in map){
        println("${name.key} - ${name.value}")
    }
    // Copy value of Mutable Map
    val mutableMapCopy =  mutableMap.toMutableMap()
    println(mutableMapCopy)


    //-----------------------------------------------Immutable list,set,map operation--------------------------------------

    // Creating an Immutable list in kotlin
    val immutableList: List<String> = listOf("I", "Love", "Java")
    // Addition of new element
    val newList = immutableList + "and Kotlin"
    println(newList)

    // Immutable lists don't support removal, but you can filter out elements
    val filteredList = immutableList.filter { element -> element != "This" }
    println(filteredList)

    // Immutable lists don't support direct updates.
    // You can create a new list with the updated elements.
    val updatedList = immutableList.map { if (it == "I") "Replaced Element" else it }
    println(updatedList)

    // Copy Operation
    val immutableListCopy = immutableList.toList()
    println(immutableListCopy)


    var immutableSet = setOf(1, 2, 3)
    // Add operation in Immutable set
    immutableSet+=4
    println(immutableSet)

    // remove operation in Immutable set
    immutableSet-=3
    println(immutableSet)

    // update operation in Immutable set
    val immutable =  immutableSet.map { if (it == 2) 5 else it}.toMutableSet()
    println(immutable)

    // Copy Operation in Immutable Set
    val immutableSetCopy = immutableSet.toMutableSet()
    println(immutableSetCopy)




    var immutableMap = mapOf("a" to 1 , "b" to 2)
    // Adding element in Immutable map
    immutableMap+="c" to 3
    println(immutableMap)

    // Removing element in Immutable map
    immutableMap-="a"
    println(immutableMap)

    // Updating element in Immutable Map
    val mutableMap = immutableMap.toMutableMap()
    mutableMap.put("c" , 100)
    val updatedMap = mutableMap.toMap()
    println(updatedMap)


    // Copying in Immutable Map
    val immutableCopy = immutableMap.toMap()
    println(immutableCopy)
}
