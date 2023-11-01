package secondWeek

// leetcode 1 - https://leetcode.com/problems/two-sum/description/
fun main(args: Array<String>) {
    val arr = intArrayOf(2, 7, 11, 15)
    val target = 9
    print(twoSum(arr, target).contentToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map: MutableMap<Int, Int> = mutableMapOf()
    val answer = IntArray(2)

    for (i in nums.indices) {
        if (map.containsKey(target - nums[i])) {
            answer[0] = map[target - nums[i]]!!
            answer[1] = i
        }

        map[nums[i]] = i
    }

    return answer
}
