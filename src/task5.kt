import kotlin.random.Random

fun generateRandomArray(n: Int): IntArray {
    val nums = mutableSetOf<Int>()
    while (nums.size < n) {
        nums.add(Random.nextInt(0, n + 1)) // Генерация случайных чисел в диапазоне [0, n]
    }
    return nums.toIntArray().sortedArray() // Преобразование в массив и сортировка для наглядности
}

fun findMissingNumberGauss(nums: IntArray): Int {
    val n = nums.size
    val expectedSum = n * (n + 1) / 2 // Формула Гаусса
    val actualSum = nums.sum()
    return expectedSum - actualSum
}

fun main() {
    val n = 10 // Размер массива
    val nums = generateRandomArray(n)
    println("Сгенерированный массив: ${nums.contentToString()}")
    val missingNumber = findMissingNumberGauss(nums)
    println("Отсутствующее число: $missingNumber")
}