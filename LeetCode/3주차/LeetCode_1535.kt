package thirdWeek

// leetcode 1535 - https://leetcode.com/problems/find-the-winner-of-an-array-game/
fun main(args: Array<String>) {
    val arr = intArrayOf(2, 1, 3, 5, 4, 6, 7)
    val k = 2
    print(getWinner(arr, k))
}

fun getWinner(arr: IntArray, k: Int): Int {
    val list = arr.toMutableList()
    var round = 0

    while (round < k && list.size > 1) {
        if (list[0] > list[1]) {
            round++
            list.removeAt(1)
        } else {
            round = 1
            list.removeAt(0)
        }
    }

    return list.get(0)
}
