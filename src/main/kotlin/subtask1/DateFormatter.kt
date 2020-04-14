package subtask1

import java.util.*
import java.text.SimpleDateFormat

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {

        try {
            val d = day.toInt()
            val m = month.toInt()
            val y = year.toInt()
            val dateFormat = SimpleDateFormat("yyyy-MM-dd")
            dateFormat.isLenient = false
            val myDate = dateFormat.parse("$y-$m-$d")
            val calendar = Calendar.getInstance()
            calendar.time = myDate

            val dayOfWeek = when (calendar.get(Calendar.DAY_OF_WEEK)) {
                1 -> "воскресенье"
                2 -> "понедельник"
                3 -> "вторник"
                4 -> "среда"
                5 -> "четверг"
                6 -> "пятница"
                7 -> "суббота"
                else -> ""
            }
            val textMonth = when (month) {
                "1" -> "января"
                "2" -> "февраля"
                "3" -> "марта"
                "4" -> "апреля"
                "5" -> "мая"
                "6" -> "июня"
                "7" -> "июля"
                "8" -> "августа"
                "9" -> "сентября"
                "10" -> "октября"
                "11" -> "ноября"
                "12" -> "декабря"
                else -> ""
            }
            return "$day $textMonth, $dayOfWeek"
        } catch (e: Exception) {
            return "Такого дня не существует"
        }

    }
}
