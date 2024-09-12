package com.imecoma.kotlincourse.lesson3

class homework {
    //
}

//название мероприятия, утвержденно
 const val event: String = "IT conference 24"
//дата может быть изменена по разным причинам
var data: String = "15.09.2024"
//место проведения так же может быть изменено
var place: String = "Krasnodar, Krasnaya Street, shopping center gallery"
//расходы на оборудование, утверждены и неизменны
val equipmentRental: Double = 50000.0 //аренда оборудования
val furnitureRental: Double = 20000.0 //аренда мебели
//расходы на кейтеринг, утверждены и неизменны
val catering: Double = 30000.0 //кейтеринг
//прочие расходы, утверждены и неизменны
val rentRoom: Double = 30000.0//аренда помещения
val security: Double = 5000.0 // охрана
val decoration: Double = 5000.0//декор, дизаин
//общий бюджет
val totalBudget: Double = equipmentRental + furnitureRental + catering + rentRoom + security + decoration
//количество участников
var participants: Int = 100
// Длительность хакатона
var durationEvent: Int = 3 // 3 часа
// Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
val SupplierContacts: String by lazy {
    "link to the archive"
}
// Текущее состояние хакатона (статус)
var status: String = "Planned"
    get() = field
    set(value) {
        if (value = )field = value // тут должны быть статусы мероприятия, но я не понял как это сделать
    }
// Список спонсоров



