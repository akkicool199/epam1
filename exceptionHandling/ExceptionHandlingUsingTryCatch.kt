package assessment_1.exceptionHandling

/*
7a. Write a Kotlin program that demonstrates exception handling.
Use a try-catch block to handle a potential `NumberFormatException`
when converting a string to an integer, and print an error message if it occurs.
 */
fun main(){
    val str: String="123a"
    val num: Int
    try {
        num=Integer.parseInt(str)
    }catch (error : NumberFormatException){
        println("$error occurred while parsing")
    }
}