package com.imecoma.kotlincourse.lesson7

fun main (){
    // for(i(переменная) in collection(список,  счетчик и т.д){
        //тело цикла
    // }
    for(i in listOf(1,2,3)){// 1..3, может использоваться диапазон в качестве коллекции
        println(i)
    }
    val g = 5
    for(e in 1..10){
        println(g * e)
    }
    for(f in listOf("a", "b")){
        println(f)
    }
    var d = "sss"
    for(s in listOf("a", "b")) {
        d = s
        println(d)
    }
    for(w in 1 until  11 step 3) {
        println(w)
    }
    val range = 1..10
    for(h in range){
        println(h)
    }

    ////////////////////////////////////

    while (false){
        //тело цикла
        println("+")
    }
    var counter = 10
    while (counter-- > 0){
        println(counter)
    }

    do{
        println("+")
        // тело цикла
    }while (false) // сначала делает потом думает

    while (false){
        // тело цикла
    } // сначало думает потом делает


    for(o in 1..10){
        if (o == 2) continue// убрал 2 из цикла
        if (o == 5) break// прервать цикл если в нем есть 5
        println(o)
    }

    for(r in 1..10){
        print(r)
    }

    for(i in 1..5){
        println(i * i)
    }

    for(i in 10 downTo 1){
        println(i)
    }

    for(i in 20 downTo 2) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    for(i in 1..30 step 3){
        println(i)
    }


    var count = 1
    var sum = 0
    while (count <= 10){
        sum = sum + count++
        println(sum)
    }







}