package firstWeek

// leetcode 1929 - https://leetcode.com/problems/concatenation-of-array/description/
fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 1)
    val answer = getConcatenation(arr)
    print(answer.contentToString())
}

fun getConcatenation(nums: IntArray) = nums + nums
