package assessment_1.collection

fun main(){
    /*   4a. Create a list of your favorite programming languages.
       Add a new language to the list and then remove one language.
       Finally, print the updated list.*/
    var languages= mutableListOf("java","kotlin","python")
    println("original list: $languages")
    languages.add("dotNet")
    println("list after addition of an element: $languages")
    languages.remove("java")
    println("list after removal of an element: $languages")
}