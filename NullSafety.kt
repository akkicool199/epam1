package assessment_1

fun main(){
    val name: String?=null
    val len=if(name!=null) name.length else -1

    println("name length is $len")

}