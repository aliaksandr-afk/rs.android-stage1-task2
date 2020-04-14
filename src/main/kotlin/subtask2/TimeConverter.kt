package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {

        val numbers = arrayOf("zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one",
            "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine")

        val h = hour.toInt()
        val m = minute.toInt()

        return when (m) {
            0 -> "${numbers[h]} o' clock"
            1 -> "one minute past ${numbers[h]}"
            59 -> "one minute to ${numbers[h + 1]}"
            15 -> "quarter past ${numbers[h]}"
            30 -> "half past ${numbers[h]}"
            45 -> "quarter to ${numbers[h + 1]}"
            in 2..29 -> "${numbers[m]} minutes past ${numbers[h]}"
            in 31..58 -> "${numbers[60 - m]} minutes to ${numbers[h + 1]}"
            else -> ""
        }
    }
}
