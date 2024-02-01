package assessment_1.collection

fun main(){

    /*
    b. Create a program perform basic operations(Add, remove, Update, copy...)
    on mutable and unmutable list, map, and set
     */

    var list= mutableListOf("akash","singh")
    list.add("kumar")
    list.removeAt(0)
    for(name in list){
        println(name)
    }
    println("-------------------------------")

    var set= mutableSetOf<Int>(1,2,3)
    set.add(4)
    set.remove(0)
    for(item in set){
        println(item)
    }
    println("-------------------------------")

    var map= mutableMapOf<Int,String>(1 to "akash",2 to "singh")
    map.put(3,"kumar")
    map.remove(1)
    for (name in map){
        println("${name.key} - ${name.value}")
    }
}
