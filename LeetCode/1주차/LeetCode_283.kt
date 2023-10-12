package firstWeek

// leetcode 283 - https://leetcode.com/problems/move-zeroes/description/
fun main(args: Array<String>) {
    val arr = intArrayOf(0, 1, 0, 3, 12)
    moveZeroes(arr)
    print(arr.contentToString())
}

fun moveZeroes(nums: IntArray) {
    var index = 0

    for (i in nums.indices) {
        val temp = nums[i]

        if (nums[i] != 0) {
            val temp = nums[i]
            nums[i] = 0
            nums[index] = temp
            index++
        }
    }
}
