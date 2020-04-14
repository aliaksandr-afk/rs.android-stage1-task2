package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val begin = a.toCharArray().toMutableList()
        val end = b.toCharArray().toMutableList()
        var i = 0
        for(num in end) {
            while (begin.size != 0) {
                if (begin[0] == num || begin[0].toUpperCase() == num) {
                    i ++
                    break
                }
                begin.removeAt(0)
            }
        }
        return if (i == end.size) {
            "YES"
        } else {
            "NO"
        }
    }
}
