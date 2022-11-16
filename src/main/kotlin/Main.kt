fun main() {
    print(solution("172.316.254.1"))
}

fun solution(inputString: String): Boolean {
    val array = inputString.split(".")
    if (array.size != 4)
        return false

    try {
        for (i in 0 until 4) {
            if (array[i].isEmpty() || array[i].toInt() > 255 || array[i].toInt() < 0 || (array[i].length > 1 && array[i][0] == '0')) {
                return false
            }
        }
    } catch (e: Exception) {
        return false
    }

    return true
}