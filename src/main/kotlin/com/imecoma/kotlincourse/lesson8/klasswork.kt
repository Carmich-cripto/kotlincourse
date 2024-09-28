package com.imecoma.kotlincourse.lesson8

fun main() {


    val simpleString = "это простая строка"

    val firstName = "Иван"
    val lastName = "Иванов"
    val fullName = firstName + " " + lastName
    //конкатенация - склеивание обьектов линейной структуры, обычно строк


    val age = 30
    val greeting = "Привет! Меня зовут $firstName и мне $age лет"
    //шаблоны $ + переменная



    
    class Person(val name: String, val age: Int)
    val person = Person("Алексей", 25)
    val inroduction = "Меня зовут ${person.name}, и мне ${person.age} лет."// фигурные скобки нужны если обращаемся к person.name, без них он обратиться только к person


    val details = "здесь находятся ${getDetails()}"//пришло из функции
    val x = 10
    val y = 20
    val resultString = "результат сложения x и y равен ${x + y}"// в скобках можно выполнять блок кода
    println(resultString)

    val originalString = "Kotlin is fun"
    val subString = originalString.substring(7)//печатает с 7го символа(is fun)
    val subString2 = originalString.substring(3,6)// вырежет с 3го по 6й символ (lin) 3 не включительно 6 включительно
    val replaceString = originalString.replace("fun", "awesome")//замена, меняем слово fun на awesome, работает для всех вхождений, если будем менять одну букву то заменяться все в предложении
    val worlds = originalString.split("is")//разделит котлин из фан на котлин, ис, фан если разделим пробелом, если разделим через ис то получим (котлин )( фан)
    val lenght ="Hello".length
    val upper = "hello".uppercase()//перевести все буквы в верхний регистр
    val lower = "HELLO".lowercase()//перевод в нижний регистр
    val trimmed = " hello ".trim()//обрезает пробелы в начале и конце
    val trimmed1 = " hello ".trim('h', ' ', 'o')//может так же удалить и несколько символов

    val starts = "Kotlin".startsWith("Kot")//выполняет проверку и возвращает тру или фолс, если будет "ot" то будет уже фолс
    println(starts)
    val ends = "Kotlin".endsWith("lin")//проверка конца строки
    val contains = "Hello".contains("ell")//проверяет на наличие подстроки , то есть подстрока елл найдена внутри слова хелло, т есть тру

    val e: String? = null
    val empty = e.isNullOrEmpty()//проверка на налл или вообще ничего нет
    val blank = "".isNullOrBlank()//проверка налл или пустой (пробел)

    val repeat = "ab".repeat(3)//повторить эту строку 3 раза
    val letter = originalString[5]// в таких скобках [] метод get , то есть взять символ 5 из ориджиналстринг и вернуть "n"
    val indexOfChar = "Kotlin".indexOf('t')//считает какой это будет индекс . считаем k -0, o -1, t - 2.выдаст 2
    val indexOfWorld = "Kotlin is the best language".indexOf("best")//так же может по строке
    val backRevers = "niltok".reversed()//поменяет все буквы в обратном направлении
    val multiLineString = """
    первая строка
            вторая строка
            третья строка
            """.trimIndent()// многострочные строки """ начинается и """ заканчивается.тримидент очистит строки от пробелов слева
    //форматирование строк
    val name = "Alexei"
    val city = "msc"
    val age1 = 22
    val friends = 99
    val rating =4
    val balance = 4444.23234
    val text = """
        Имя:%s
        Город:%s
        Возраст:%d
        Количество друзей:%,d// , - разбивает на тысячи т е чере пробел
        Рейтинг юзера:%.1f// 1 - 1 знак после запятой
        Баланс:$%,.2f// $- $ баланса, , - отделяет тысячи и 2 - 2 знака после запятой
        """.trimIndent()
    println(text.format(name, city, age1, friends, rating, balance))//метод формат будет передавать в порядке котором написано в заглушки



}

fun getDetails(): String {
    return "очень интересные детали"
}
