package com.imecoma.kotlincourse.lesson3

class homework {
    //
}

//название мероприятия, утвержденно и неизменно на века
val event: String = "Pivozavr fest 2024"
//дата может быть изменена по разным причинам
var data: String = "15.09.2024"
//место проведения так же может быть изменено
var place: String = "Krasnodar, Krasnaya Street, shopping center gallery"
//расходы на оборудование, утверждены и неизменны
val beerBottlingEquipmentRental: Double = 50000.0 //аренда пивного оборудования
val furnitureRental: Double = 20000.0 //аренда мебели
//расходы на кейтеринг, утверждены и неизменны
val catering: Double = 30000.0 //кейтеринг
//прочие расходы, утверждены и неизменны
val rentRoom: Double = 30000.0//аренда помещения
val security: Double = 5000.0 // охрана
val decoration: Double = 5000.0//декор, дизаин
val liveMusic: Double = 2000.0 //лайв мьюзик
//общий бюджет
val totalBudget: Double = beerBottlingEquipmentRental + furnitureRental + catering + rentRoom + security + decoration + liveMusic
//количество участников
var