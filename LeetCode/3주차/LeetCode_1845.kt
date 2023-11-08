package thirdWeek

// leetcode 1845 - https://leetcode.com/problems/seat-reservation-manager/description/
fun main(args: Array<String>) {
    var seatManager = SeatManager(5)

    println(seatManager.reserve())
    println(seatManager.reserve())
    seatManager.unreserve(2)
    println(seatManager.reserve())
    println(seatManager.reserve())
    println(seatManager.reserve())
    println(seatManager.reserve())
    seatManager.unreserve(5)
}

class SeatManager(n: Int) {

    val seat = BooleanArray(n)

    fun reserve(): Int {
        var smallest = 0

        for (i in seat.indices) {
            if (!seat[i]) {
                seat[i] = true
                smallest = i
                break
            }
        }

        return smallest + 1
    }

    fun unreserve(seatNumber: Int) {
        seat[seatNumber - 1] = false
    }
}
