import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GameOfLifeAcceptanceTest {

    @Test
    fun `a lonely single cell in the world die for loneliness`() {
        val worldWithOneCellAlive = listOf(
            listOf(false, false, false),
            listOf(false, true, false),
            listOf(false, false, false)
        )

        val evolvedWorld = evolve(worldWithOneCellAlive)

        val expected = listOf(
            listOf(false, false, false),
            listOf(false, false, false),
            listOf(false, false, false)
        )
        assertEquals(expected, evolvedWorld)
    }

    @Test
    fun `a world with a square pattern is static`() {
        val squarePatternWorld = listOf(
            listOf(false, false, false),
            listOf(false, true, true),
            listOf(false, true, true)
        )

        val evolvedWorld = evolve(squarePatternWorld)

        assertEquals(squarePatternWorld, evolvedWorld)
    }
}