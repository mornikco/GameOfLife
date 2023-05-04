import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class WorldTest {

    @Test
    fun `serialize an empty world`() {
        val emptyWorld = World()

        val serialized = emptyWorld.serialize()

        val expected = listOf(
            listOf(false, false, false),
            listOf(false, false, false),
            listOf(false, false, false)
        )
        assertEquals(expected, serialized)
    }

    @Test
    fun `serialize a world with an alive cell`() {
        val emptyWorld = World(aliveCells = setOf(
            Coordinate(x = 1, y = 1)
        ))

        val serialized = emptyWorld.serialize()

        val expected = listOf(
            listOf(false, false, false),
            listOf(false, true, false),
            listOf(false, false, false)
        )
        assertEquals(expected, serialized)
    }

    @Test
    fun `serialize a more populated world`() {
        val emptyWorld = World(aliveCells = setOf(
            Coordinate(x = 0, y = 0), Coordinate(x = 1, y = 0),
            Coordinate(x = 0, y = 1)
        ))

        val serialized = emptyWorld.serialize()

        val expected = listOf(
            listOf(true, true, false),
            listOf(true, false, false),
            listOf(false, false, false)
        )
        assertEquals(expected, serialized)
    }
}