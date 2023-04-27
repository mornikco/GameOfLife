import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class WorldDeserializerTest {

    private val deserializer = WorldDeserializer()

    @Test
    fun `build empty world from string`() {
        val worldString =
            "...\n" +
            "...\n" +
            "...\n"

        val actual = deserializer.from(worldString)

        val expected = World(emptyList())
        assertEquals(expected, actual)
    }

    @Test
    fun `build world from string`() {
        val worldString =
            ".X.\n" +
            "XX.\n" +
            "..X\n"

        val actual = deserializer.from(worldString)

        val expected = World(listOf(
            Coordinate(x = 1, y = 0),
            Coordinate(x = 0, y = 1),
            Coordinate(x = 1, y = 1),
            Coordinate(x = 2, y = 2),
        ))
        assertEquals(expected, actual)
    }

}