package secondWeek

// leetcode 155 - https://leetcode.com/problems/min-stack/description/
fun main(args: Array<String>) {
    var stack = MinStack()
    stack.push(-2)
    stack.push(0)
    stack.push(-3)
    println(stack.getMin())
    stack.pop()
    println(stack.top())
    println(stack.getMin())
}

class MinStack() {

    val stack: MutableList<Int> = mutableListOf()

    fun push(`val`: Int) {
        stack.add(`val`)
    }

    fun pop() {
        stack.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return stack.min()
    }
}
