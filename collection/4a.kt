package assessment_1.collection

fun main(){

    var languages= mutableListOf("java","kotlin","python")
    println("original list: $languages")
    languages.add("dotNet")
    println("list after addition of an element: $languages")
    languages.remove("java")
    println("list after removal of an element: $languages")
}