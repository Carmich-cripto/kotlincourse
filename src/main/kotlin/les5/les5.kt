package les5


fun main(){
    val sum = 5 + 3
    val diff = 10 - 5
    val product = 10 * 5
    val quotient = 10 / 5
    val remainder = 10 % 5 //вычисление остатков от деления, если два числа делятся не поровну

    //операторы сравнения
    val isEqual = 5 == 5//левый операнд взаимодействует с правым и получаем булево значение тру
    val isEqual1 = 5 == 4//будет фолс, по дефолту, писать такое в коде бессмыслено
    val isNotEqual = (5 != 5)//!-это не(логическое не) , 5!=5 - фолс
    val isGreater = (5 > 3)//тру
    val isLesser = (5 < 3)//фолс
    val isGreaterOrEqual = (5 >= 5)//сравнение, 5>=5 тру, 5>5 фолс
    val isLesserOrEqual = (5 <= 3)//тоже только <=

    //логические операторы
    val andResult = (5 > 3) && (5 > 4)// в данном примере тру(5>3) и тру (5>4) в результате = тру, true && false = false, тру будет только когда справа и лева будет тру
    val orResult = (5 > 3) || (5 < 4)//оператор или, в данном примере тру || фолс = вернет тру, возвращает тру если один из операндов будет тру, возвращает фолс если оба фолс
    val notResult = !(5 > 3)//в данном примере это фолс, то есть нот переворачивает значение, было тру , стало фолс после использования оператора нот

    //операторы присваивания
    var number = 5//= это оператор присваивания который присваивает переменной намбер значение 5
    number += 3//присваивание с увеличением, number = number + 3( number += 3) ,будет тоже самое
    number -= 2//тоже только с -, 5+3=8-2=6
    number *= 2//тоже самое с умножением, 5+3-2*2=12
    number /= 2//тоже с делением

    //операторы инкримента и дикримента
    number++//увеличит текущее числовое значение на 1(инкримент)
    number--//дикримент, уменьшает на 1
    //println(number++) сперва результат потом увеличение, println(++number)-сперва увеличение потом результат
    //операции в () будут выполняться в первую очередь, */ следующие,+- вторая очередь
    //логическое не val notResult = ! имеет приоритет, логическое val andResult && следующий приоретет, логическое или val orResult || наименьший приоритет

    val example = ((8 + 1) >= 9) || (6 - 2 != 4) && (2 * 3 == 6)
    //приоритет: сперва вычисления, потом логические.1-то что в скобках. результат тру

    // оператор элвиса
    var name: String? = null

    val result1 = name ?: "Unknown"// если name = null то вернуть начение unknown //result присваиваем значение нейм, но если нейм = налл, то значение unknown
    val result = name ?: throw  IllegalArgumentException ("не может быть налл")



    println(number)
}

