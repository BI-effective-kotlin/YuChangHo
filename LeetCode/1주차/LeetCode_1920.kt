package firstWeek

// leetcode 1920 - https://leetcode.com/problems/build-array-from-permutation/description/
fun main(args: Array<String>) {
    val arr = intArrayOf(0, 2, 1, 5, 3, 4)
    val answer = buildArray(arr)
    print(answer.contentToString())
}

// solution1
fun buildArray(nums: IntArray): IntArray {
    val answer = IntArray(nums.size)

    for (i in nums.indices) {
        answer[i] = nums[nums[i]]
    }
    return answer
}

// solution2
// fun buildArray(nums: IntArray): IntArray {
//    val answer = IntArray(nums.size)
//
//    nums.forEachIndexed { index, i -> // nums의 index와 value -> index, i
//        answer.set(index, nums[i])
//    }
//
//    return answer
// }
