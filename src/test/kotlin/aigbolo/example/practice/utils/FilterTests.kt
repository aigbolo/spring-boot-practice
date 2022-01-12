package aigbolo.example.practice.utils

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class FilterTests : FreeSpec() {
    init {
        "should return 2 max values" {
//            Arrange
            val unSortValues: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 34, 567, 65, 34, 2, 4, 67, 87, 21)
            val maxValues = unSortValues.sorted().subList(unSortValues.size-2, unSortValues.size)

            // Act
            val actualResult = findMaxValue(unSortValues)

            // Assert
            println("values: $actualResult")
            actualResult shouldBe maxValues

        }
    }

}