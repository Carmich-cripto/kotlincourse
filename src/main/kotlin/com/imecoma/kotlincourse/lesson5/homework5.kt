package com.imecoma.kotlincourse.lesson5

//Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление, которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять. Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.


fun main() {

    pressureCheck(pressure = 100.0)
    pressureCheck(pressure = null)

}

    val dataLost: Double? = null
    val thereIsData: Double = 100.0

    fun pressureCheck(pressure: Double?) {
        println(pressure ?: throw Exception("data is lost"))



    }


