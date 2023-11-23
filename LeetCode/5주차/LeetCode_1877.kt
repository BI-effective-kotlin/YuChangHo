package fifthWeek

import kotlin.math.max

// leetcode 1877 - https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/
fun main(args: Array<String>) {
    val arr = intArrayOf(3, 5, 4, 2, 4, 6)
    print(minPairSum(arr))
}

fun minPairSum(nums: IntArray): Int {
    var answer = 0
    nums.sort()

    for (i in 0 until nums.size / 2) {
        answer = max(answer, nums[i] + nums[nums.size - i - 1])
    }

    return answer
}
