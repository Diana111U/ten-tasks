import kotlin.system.measureTimeMillis

fun find(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (i != j && nums[j] < nums[i]) {
                result[i]++
            }
        }
    }
    return result
}

fun main() {
    val timeTaken = measureTimeMillis{
        val nums = IntArray((2..500).random()) { (0..100).random() }
        println("Массив "+nums.contentToString())
        val result = find(nums)
        println("Результат: ${result.contentToString()}")
    }
    println("Время выполнения: $timeTaken мс")
}
