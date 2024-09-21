package com.imecoma.kotlincourse.lesson5



fun main() {
//Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление, которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять. Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.

    pressureCheck(pressure = 100.0)
    pressureCheck(pressure = null)

    fullPrice(costOfCargo = 100.0)
    fullPrice(costOfCargo = null)

    calculateIntensity(initialIntensity = 100.0, dampingFactor = null)// не хватило времени довести до ума

}
    fun pressureCheck(pressure: Double?) {
        println(pressure ?: throw Exception("data is lost"))
    }
val dataLost: Double? = null
val thereIsData: Double = 100.0

//Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
//Задача: Рассчитать полную стоимость доставки.

fun fullPrice(costOfCargo: Double?){
val price = ((0.5 / 100) * (costOfCargo ?: 50.0 )) + (costOfCargo ?: 50.0)
    println(price)
}

//: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение начальной интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
//Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.

fun calculateIntensity(initialIntensity: Double, dampingFactor: Double?) {
    val effectiveDampingFactor = dampingFactor ?: 0.5
    println(effectiveDampingFactor) //не хватило времени довести до ума
}