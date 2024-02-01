package assessment_1.exceptionHandling

fun main(){

    val result: Result<Int> = runCatching { Integer.parseInt("23a") }

    result.onFailure { ex-> println("unable to parse ${ex.message}") }
    result.onSuccess { num-> println(num) }
}