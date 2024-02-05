package assessment_1

fun main(){
    var str : String = "Kotlin is concise and expressive"
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var vowelCount : Int = 0
    for(char in str.lowercase(Locale.getDefault())) {
        if (char in vowels) {
            vowelCount++
        }
    }
    println("count of the Vowel : $vowelCount")
}
