import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class WorldTest {

    @Test
    fun `world is serialized in a map of 3x3 starting from 0,0 coordinate`() {
        val world = World(aliveCellCoordinates = setOf(Coordinate(0, 1), Coordinate(2, 1), Coordinate(0, 0)))

        val actual = world.toWorldData( /* topLeftCoordinate = Coordinate(), bottomRightCoordinate = Coordinate() */ )

        val expected = listOf(
            listOf(true, false, false),
            listOf(true, false, true),
            listOf(false, false, false),
        )
        assertEquals(expected, actual)
    }
}