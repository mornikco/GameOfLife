import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class WorldTest {

    @Test
    fun `a representation of an empty world is composed by strings with dots`() {
        val emptyWorld = World()

        val expectedString =
            "...\n" +
            "...\n" +
            "...\n"
        assertEquals(expectedString, emptyWorld.toString())
    }

    @Test
    fun `a representation of a world with alive cells is composed by dots and X`() {
        val world = World(listOf(
            Coordinate(x = 1, y = 0),
            Coordinate(x = 0, y = 1),
            Coordinate(x = 1, y = 2)
        ))

        val expected =
            ".X.\n" +
            "X..\n" +
            ".X.\n"
        assertEquals(expected, world.toString())
    }
}
