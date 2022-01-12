package aigbolo.example.practice.utils

fun sortFromValues(values: List<Int>): List<Int> {
    return sortAsc(values)
}

private fun sortAsc(values: List<Int>, currentIndex: Int = 0, currentRound: Int = 1): List<Int> {
    val valueSize = values.size
    if(currentRound > valueSize)
        return values
    val currentValue = values[currentIndex]
    val lessThanCurrentValues: MutableList<Int> = mutableListOf()
    val equalOrMoreThanCurrentValues: MutableList<Int> = mutableListOf()
    for (value in values) {
        if(currentValue > value) {
            lessThanCurrentValues.add(value)
        }else{
            equalOrMoreThanCurrentValues.add(value)
        }
    }

    val newValues: MutableList<Int> = mutableListOf()
    newValues.addAll(lessThanCurrentValues)
    newValues.addAll(equalOrMoreThanCurrentValues)

    val nextIndex:Int = if(currentIndex + 1 == valueSize)  0 else currentIndex + 1
    val nextRound: Int = if (nextIndex == 0) currentRound + 1 else currentRound

    return sortAsc(newValues.toList(), nextIndex, nextRound)
}