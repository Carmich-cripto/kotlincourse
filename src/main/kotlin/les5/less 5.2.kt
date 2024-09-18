package les5

fun main() {
printPrice( price: 123.8, s: null)
    printPrice( price: 100.0, s: null)
}


fun printPrice(price: Double, s: Int?){
    val koef = (100 - (s ?: 0))/100.0

    println(price * koef)
}