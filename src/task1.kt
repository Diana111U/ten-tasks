import kotlin.system.measureTimeMillis

fun main() {
    val timeTaken = measureTimeMillis{
        val nums1 = IntArray((1..1000).random()){ (0..1000).random()}
        println("Массив nums1 "+nums1.contentToString())
        val set1 = nums1.toSet()
        val nums2 = IntArray((1..1000).random()) {(0 .. 1000).random()}
        val set2 = nums2.toSet()
        println("Массив nums2 "+nums2.contentToString())
        val result =  set1.intersect(set2)//поиск уникальных элементов
        println("Массив пересечений $result")
    }
    println("Время выполнения: $timeTaken мс")
}