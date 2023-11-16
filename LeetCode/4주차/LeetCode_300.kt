package fourthWeek

// leetcode 300 - https://leetcode.com/problems/longest-increasing-subsequence/
fun main(args: Array<String>) {
    val arr = intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)
    print(lengthOfLIS(arr))
}

fun lengthOfLIS(nums: IntArray): Int {
    val sub = IntArray(nums.size)
    var index = 1
    sub[0] = nums[0]

    for (i in 1 until nums.size) {
        var current = -1

        for (j in 0 until index) {
            if (nums[i] <= sub[j]) {
                sub[j] = nums[i]
                break
            } else {
                current = j
            }
        }

        if (current == index - 1) {
            sub[index] = nums[i]
            index++
        }
    }

    return index
}
