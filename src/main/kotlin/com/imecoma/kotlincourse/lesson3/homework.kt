package com.imecoma.kotlincourse.lesson3

class homework {
    //
}

//название мероприятия, утвержденно
val event: String = "IT conference 24"
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
var participants: Int = 0
    get () = field
    private set(value) {}
// Длительность хакатона
var durationEvent: Long = 3*60*60 // 3 часа
// Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
private lateinit var supplierContacts: String
// Текущее состояние хакатона (статус)
var status: String = "Planned"
// Список спонсоров
val listSponsors: String = ""
//Бюджет мероприятия
private val  budgetEvent: Double = 200000.0
//Текущий уровень доступа к интернету
var InternetConnection: Int = 5
//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
private var information: String = ""
//Количество команд
var numberOfCommands: Int = 0
//Перечень задач
val tasks: String = "information about tasks"
//План эвакуации
val evacuationPlan: String = "link"
//Список доступного оборудования
var availableEquipment: String = "equipment"
//Список свободного оборудования
var freeEquipment: String = "Free equipment"
//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var nutrition: String
//План мероприятий на случай сбоев
val planFailed: String = ""
//Список экспертов и жюри
val experts: String = ""
//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
var review: String = ""
//Политика конфиденциальности
val confidential: String = ""
//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private var privateReviews: String = ""
//Текущая температура в помещении
var temperature: Int = 25
//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var analysis: String = ""
//Уровень освещения
var light: Int = 1
//Лог событий мероприятия
lateinit var log: String
//Доступность медицинской помощи
var medicine: String = ""
//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций
val safety: String = ""
//Регистрационный номер мероприятия
val regNomber: Double = 1.1
//Максимально допустимый уровень шума в помещении хакатона.
val Decibels: String = "11Db"
//Индикатор превышения уровня шума в помещениях
var noise: Boolean = false
//Формат мероприятия (зависит от геополитической обстановки)
var form: String = ""
//Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
var places: Int = 0
    get () = field
    set(value) {
        if(value >0) field = value
    }
//План взаимодействия с прессой
var pressPlan: String = ""
//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
var info: String = ""
//Статус получения всех необходимых разрешений
var statuses: String = ""
//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
var resurses: Boolean = false
//Список партнеров мероприятия
val list: String =""
//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
val countingDown: String by lazy {""}
//План распределения призов
val prizes: String = ""
//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам .
private val infoSos: String = ""
//Особые условия для участников с ограниченными возможностями
val specialConditions: String = ""
//Общее настроение участников (определяется опросами)
val mood: String by lazy {""}
//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
lateinit var plan: String
//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
var special: String = ""
//Максимальное количество людей, которое может вместить место проведения.
val maxPlace: Int = 200
//Стандартное количество часов, отведенное каждой команде для работы над проектом.
val hours: Long = 1*60*60 //максимум 1 час