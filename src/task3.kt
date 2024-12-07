import kotlin.system.measureTimeMillis

fun Sum(nums: IntArray, target: Int): IntArray? {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return null
}

fun main() {
    val timeTaken = measureTimeMillis {
        val nums = IntArray((2..10000).random()) { (-1000000000..1000000000).random() }
        val target = (-1000000000..1000000000).random()
        val result = Sum(nums, target)
        println("Индексы значений в массиве, которые в сумме дают $target: ${result.contentToString()}")
    }
    println("Время выполнения: $timeTaken мс")
}