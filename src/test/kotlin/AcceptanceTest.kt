import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AcceptanceTest {

    @Test
    fun `a world with a single living cell becomes an empty world`() {
        val startingWorld = listOf(
            listOf(false, false, false),
            listOf(false, true, false),
            listOf(false, false, false),
        )

        val actual = evolve(startingWorld)

        val expected = listOf(
            listOf(false, false, false),
            listOf(false, false, false),
            listOf(false, false, false),
        )
        assertEquals(expected, actual)
    }

    @Test
    fun `static 2x2 block pattern`() {
        val startingWorld = listOf(
            listOf(false, true, true),
            listOf(false, true, true),
            listOf(false, false, false),
        )

        val actual = evolve(startingWorld)

        val expected = listOf(
            listOf(false, true, true),
            listOf(false, true, true),
            listOf(false, false, false),
        )
        assertEquals(expected, actual)
    }

    @Test
    fun `blinker pattern`() {
        val startingWorld = listOf(
            listOf(false, true, false),
            listOf(false, true, false),
            listOf(false, true, false),
        )

        val actual = evolve(startingWorld)

        val expected = listOf(
            listOf(false, false, false),
            listOf(true, true, true),
            listOf(false, false, false),
        )
        assertEquals(expected, actual)
    }
}

