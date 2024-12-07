import kotlin.system.measureTimeMillis
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val timeTaken = measureTimeMillis{
        val nums1 = IntArray((1..1000).random()){ (0..1000).random()}
        println("Массив nums1 "+nums1.contentToString())
        val nums2 = IntArray((1..1000).random()) {(0 .. 1000).random()}
        println("Массив nums2 "+nums2.contentToString())
        val result = Find(nums1, nums2)
        println("Массив пересечений "+result.contentToString())
    }
    println("Время выполнения: $timeTaken мс")
}
fun Find(nums1: IntArray, nums2: IntArray): IntArray {
    // Преобразуем первый массив в множество для автоматического удаления дубликатов
    val set1 = nums1.toSet()
    // Создаем список для хранения элементов пересечения
    val findList = mutableListOf<Int>()
    // Проходим по второму массиву
    for (num in nums2) {
        // Если элемент присутствует в множестве set1 и еще не добавлен в intersectionList,
        // добавляем его в список
        if (set1.contains(num) && !findList.contains(num)) {
            findList.add(num)
        }
    }
    // Преобразуем список в массив и возвращаем
    return findList.toIntArray()
}