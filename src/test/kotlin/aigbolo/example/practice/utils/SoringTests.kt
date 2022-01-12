package aigbolo.example.practice.utils

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class SoringTests : FreeSpec() {
    init {
        "should sort number from min to max value" {
            // Arrange
            val unSortValues = listOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
            val expectedValues = unSortValues.sorted()

            // Act
            val actualValues = sortFromValues(unSortValues.shuffled())

            // Assert
            actualValues shouldBe expectedValues
        }
    }
}