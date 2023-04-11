import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class WorldTest {

    @Test
    fun `world is serialize in a map of 3x3 starting from 0,0 coordinate`() {
        val world = World(aliveCellCoordinates = listOf(Coordinate(1, 1)))

        val actual = world.toWorldData( /* topLeftCoordinate = Coordinate(), bottomRightCoordinate = Coordinate() */ )

        val expected = listOf(
            listOf(false, false, false),
            listOf(false, true, false),
            listOf(false, false, false),
        )
        assertEquals(expected, actual)
    }
}