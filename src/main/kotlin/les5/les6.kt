package les5

class les6 {
}




// {
//    val number = 4
//    if (number > 5) {
//    //if - если (условие) = true , то будет выполнен блок кода
//        println("число больше 5")
//
//    }
//    else {
//        //иначе( если if (number > 5) неверно, то выполнится else
//        println("число меньше или равно 5")
//    }
//    val number: Int = 11
//    if (number < 0) {
//        println("отрицательное")
//    }
//    else if(number == 0){
//        println("=0")
//        //если if неверно, то выполняем else if, если else if неверно, то выполняем else
//    }
//    else if(number == 11) {
//        println("=11")
//    }
//    else {
//        println("положительное")
//    }

//    IntRange - диапозон целочисленных значений( 1-2-3-4-10) 1 .. 10 для задания диапазона включительно.
//     Всегда возрастающий диапазон. 1 until 10 - задание диапазона не включительно большее значение
//     если обратный диапазон то downTo, включительно всегда
//     диапазон для char = charRange
//    val intRange: IntRange = 1..10
//    val intRangeUntil = 1 until 10
//    val downTo = 10 downTo 1
//    val charRange: CharRange = 'd' .. 't'
//
//    val inRange= 2 in intRange // оператор in проверяет входит ли 2 в диапазон intRange( в диапазоне 1-10)
//    val notInRange = 2 !in intRange //вне диапазона 1-10
//    println(intRange)
//    println(inRange)
//
//    val score = 95
//    //when - когда условие, то
//    when (score) {
//        in 90 .. 100 -> println("great")
//        in 80 .. 89 -> println("good")
//        in 70 .. 79 -> println("bad")
//        else -> println("very bad")
//    }
//    val score1 = 101
//    //when - когда условие, то
//    when {
//        score1 > 100 -> {
//            println("great")
//        }
//        score1 in 80..89 -> {
//            println("good")
//        }
//        score1 in 70..79 -> {println("bad")
//    }
//        else -> {
//            println("very bad")
//        }
//    }


//    val a = 5
//    val b =4
//    val max = if (a > b) {
//        println("")
//        val c = a * b
//        c
//    } else b //если а больше б , то распечатать а, а если б больше а тогда распечатать б
//    println(max)

//        val score = 85
//    //when - когда условие, то
//    val result = when (score) {
//        in 90..100 -> "great"
//        in 80..89 -> "good"
//        in 70..79 -> "bad"
//        else -> "very bad"
//
//    }
//    println(result)


//    fun getTimesOfDay(hour: Int): String{
////        if (hour in 0..4) return "ночь"
////        if (hour in 5..11) return "утро"
//        return if (hour < 0 || hour > 23){
//            "неверное время"
//        }
//        else if (hour in 0 .. 4) {
//            "ночь"
//        } else if (hour in 5 .. 11){
//            "утро"
//        } else if (hour in 12..16){
//            "день"}
//            else {
//                "вечер"
//            }
//
//    }
//println(getTimesOfDay(23))

//    fun getTimesOfDay(hour: Int): String{
////        if (hour in 0..4) return "ночь"
////        if (hour in 5..11) return "утро"
//        return when {
//            hour < 0 || hour > 2 ->"неверное время"
//            hour in 0 .. 4 ->"ночь"
//            hour in 5 .. 11 ->"утро"
//            hour in 12..16 ->"день"
//            else -> "вечер"
//        }
//
//    }
//    println(getTimesOfDay(24))
//
//    }
