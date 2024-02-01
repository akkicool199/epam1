package assessment_1

// using extension prop
val Int.isDivBy5:Boolean
    get() = this.mod(5)==0

fun main(){
    val listOfNum= listOf<Int>(5,10,15,20,22,24,25)
    val listOfNumDivBy5=listOfNum.filter { it.isDivBy5 }
    listOfNumDivBy5.forEach { println(it) }
}