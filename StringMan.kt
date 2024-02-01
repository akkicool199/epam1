package assessment_1

fun main(){
    val sentence = "Kotlin is concise and expressive"
    var vowel=0
    for (i in 0 .. sentence.length-1){
        val ch=sentence[i]
        if(ch=='a' || ch =='e' || ch == 'i' || ch=='o' || ch =='u')
            vowel++
    }
    println("vowel count in '$sentence' is $vowel")
}