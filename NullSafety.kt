package assessment_1

fun main(){

    var name : String = "Akash"
    name = null; //Not Allowed
    println(name.length)

    var name2 : String? = "Akash"
    name2 = null
    // This statement will not throw null pointer Exception
    println(name2?.length)

}
