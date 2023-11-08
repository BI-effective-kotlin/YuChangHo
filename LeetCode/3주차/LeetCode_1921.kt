package thirdWeek

import kotlin.math.ceil

// leetcode 1921 - https://leetcode.com/problems/eliminate-maximum-number-of-monsters/description/
fun main(args: Array<String>) {
    val dist = intArrayOf(1, 3, 4)
    val speed = intArrayOf(1, 1, 1)
    print(eliminateMaximum(dist, speed))
}

fun eliminateMaximum(dist: IntArray, speed: IntArray): Int {
    val time = IntArray(dist.size)
    var answer = 0

    time.forEachIndexed { index, i ->
        time[index] = ceil(dist[index] / speed[index].toDouble()).toInt()
    }

    time.sort()

    time.forEachIndexed { index, i ->
        if (i > index) {
            answer++
        } else {
            return answer
        }
    }

    return answer
}
