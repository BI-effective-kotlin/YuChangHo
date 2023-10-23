package secondWeek

// leetcode 70 - https://leetcode.com/problems/climbing-stairs/description/
fun main(args: Array<String>) {
    val n = 3
    print(climbStairs(n))
}

fun climbStairs(n: Int): Int {
    val dp = IntArray(n)

    if (n <= 1) {
        return n
    }

    dp[0] = 1
    dp[1] = 2

    for (i in 2..n - 1) {
        dp[i] = dp[i - 2] + dp[i - 1]
    }

    return dp[dp.size - 1]
}
