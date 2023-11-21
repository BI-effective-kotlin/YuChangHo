package fifthWeek

// leetcode 1887 - https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/description/
fun main(args: Array<String>) {
    val arr = intArrayOf(1, 1, 2, 2, 3)

    print(reductionOperations(arr))
}

fun reductionOperations(nums: IntArray): Int {
    val countNum = mutableListOf<Int>()
    var answer = 0
    var sum = 0
    var count = 0
    nums.sort()

    for (i in 0 until nums.size - 1) {
        count++

        if (i == nums.size - 2 && nums[i] == nums[i + 1]) {
            count++
            countNum.add(count)
        }

        if (nums[i] != nums[i + 1]) {
            countNum.add(count)
            count = 0

            if (i == nums.size - 2) {
                countNum.add(1)
            }
        }
    }

    for (i in countNum.size - 1 downTo 1) {
        sum += countNum[i]
        answer += sum
    }

    return answer
}
