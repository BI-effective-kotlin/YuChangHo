package secondWeek

// leetcode 200 - https://leetcode.com/problems/number-of-islands/description/
fun main(args: Array<String>) {
    val arr = arrayOf(
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '1', '0', '0'),
        charArrayOf('0', '0', '0', '1', '1'),
    )

    print(numIslands(arr))
}

fun numIslands(grid: Array<CharArray>): Int {
    var answer = 0

    for (i in 0..grid.lastIndex) {
        for (j in 0..grid[0].lastIndex) {
            if (grid[i][j] == '1') {
                checkLand(grid, i, j)
                answer++
            }
        }
    }

    return answer
}

fun checkLand(grid: Array<CharArray>, i: Int, j: Int) {
    if (i < 0 || j < 0 || i >= grid.size || j >= grid[0].size || grid[i][j] == '0') {
        return
    }

    grid[i][j] = '0'
    checkLand(grid, i + 1, j)
    checkLand(grid, i - 1, j)
    checkLand(grid, i, j + 1)
    checkLand(grid, i, j - 1)
}
