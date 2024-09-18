package les5

fun main() {
    printBoxStuff(stuff = "Russian")
    printBoxStuff(stuff = null)
}


fun printPrice(price: Double, s: Int?){
    val koef = (100 - (s ?: 0))/100.0

    println(price * koef)
}

fun printSiteLang(lang: String?) {
    val defaultLang: String = "English"
    println(lang ?: "English")

}

fun printBoxStuff(stuff: String?) {
    println(stuff ?: throw Exception(" box is empty"))
}
