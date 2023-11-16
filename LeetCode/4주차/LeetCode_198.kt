package fourthWeek

import kotlin.math.max

// leetcode 198 - https://leetcode.com/problems/house-robber/description/
fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 1)
    print(rob(arr))
}

fun rob(nums: IntArray): Int {
    val dp = IntArray(nums.size)

    dp[0] = nums[0]
    if (nums.size == 1) {
        return dp[0]
    }

    dp[1] = max(nums[0], nums[1])
    if (nums.size == 2) {
        return dp[1]
    }

    for (i in 2 until nums.size) {
        dp[i] = max(dp[i - 2] + nums[i], dp[i - 1])
    }

    return dp[nums.size - 1]
}
