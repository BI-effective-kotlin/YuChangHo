package fourthWeek

// leetcode 2785 - https://leetcode.com/problems/sort-vowels-in-a-string/
fun main(args: Array<String>) {
    val s = "lEetcOde"

    print(sortVowels(s))
}

fun sortVowels(s: String): String {
    var index = 0
    val answer = StringBuilder()
    val vowelList = findVowel(s)

    if (vowelList.isEmpty()) {
        return s
    }

    vowelList.sort()

    for (char in s) {
        if (isVowel(char)) {
            answer.append(vowelList[index])
            index++
        } else {
            answer.append(char)
        }
    }

    return answer.toString()
}

fun isVowel(char: Char): Boolean {
    return when (char) {
        'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true
        else -> false
    }
}

fun findVowel(target: String): MutableList<Char> {
    val vowelList = mutableListOf<Char>()

    for (char in target) {
        if (isVowel(char)) {
            vowelList.add(char)
        }
    }

    return vowelList
}
