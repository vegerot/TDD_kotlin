import kotlin.test.Test
import kotlin.test.assertEquals

internal class SampleTest {

    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        five * 2
        assertEquals(10, five.amount)

    }
}

class Dollar(var amount: Int) {

    operator fun times(multiplier: Int) {
        amount *= multiplier
    }
}
