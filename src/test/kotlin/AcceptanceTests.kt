import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AcceptanceTests {

    @Test
    fun `small world with single live cell`() {
        val startingWorld =
            "...\n" +
            ".X.\n" +
            "...\n"

        val evolvedWorld = evolve(startingWorld)

        val expected =
            "...\n" +
            "...\n" +
            "...\n"
        assertEquals(expected, evolvedWorld)
    }

    @Test
    fun `small world with some live cell`() {
        val startingWorld =
            ".X.\n" +
            "XXX\n" +
            ".X.\n"

        val evolvedWorld = evolve(startingWorld)

        val expected =
            ".X.\n" +
            "X.X\n" +
            ".X.\n"
        assertEquals(expected, evolvedWorld)
    }
}