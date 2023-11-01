package secondWeek

// leetcode 70 - https://leetcode.com/problems/climbing-stairs/description/
fun main(args: Array<String>) {
    val n = 3
    print(climbStairs(n+1))
}

fun climbStairs(n: Int): Int {
    if (n <= 0) return 0

    val baseMatrix = arrayOf(
        intArrayOf(1, 1),
        intArrayOf(1, 0),
    )
    val resultMatrix = matrixPower(baseMatrix, n - 1)

    return resultMatrix[0][0]
}

fun matrixPower(matrix: Array<IntArray>, n: Int): Array<IntArray> {
    if (n == 1) {
        return matrix
    }

    if (n % 2 == 0) {
        val halfPower = matrixPower(matrix, n / 2)

        return matrixMultiply(halfPower, halfPower)
    } else {
        val halfPower = matrixPower(matrix, (n - 1) / 2)
        val result = matrixMultiply(halfPower, halfPower)

        return matrixMultiply(result, matrix)
    }
}

fun matrixMultiply(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Array<IntArray> {
    val result = arrayOf(
        intArrayOf(0, 0),
        intArrayOf(0, 0),
    )

    for (i in 0 until 2) {
        for (j in 0 until 2) {
            for (k in 0 until 2) {
                result[i][j] += matrix1[i][k] * matrix2[k][j]
            }
        }
    }

    return result
}
