package aigbolo.example.practice.utils

fun findMaxValue (values: List<Int>): List<Int> {
    val valueSize = values.size
    if(valueSize == 0) return emptyList()

    val sortedValues: List<Int> = sortFromValues(values)
   return if (sortedValues.size ==1) sortedValues else listOf(sortedValues[valueSize-2],sortedValues[valueSize-1])
}