package fifthWeek

// leetcode 1846 - https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/
fun main(args: Array<String>) {
    val arr = intArrayOf(2, 2, 1, 2, 1)
    print(maximumElementAfterDecrementingAndRearranging(arr))
}

fun maximumElementAfterDecrementingAndRearranging(arr: IntArray): Int {
    arr.sort()
    arr[0] = 1
    var increasingNum = 1

    for (i in 1 until arr.size) {
        if (arr[i] - arr[i - 1] > 1) {
            increasingNum++
            arr[i] = increasingNum
        } else {
            increasingNum = arr[i]
        }
    }

    return arr[arr.size - 1]
}
