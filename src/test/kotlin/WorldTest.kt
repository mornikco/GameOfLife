import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class WorldTest {

    @Test
    fun `world is serialized in a map of 3x3 starting from 0,0 coordinate`() {
        val world = World(aliveCellCoordinates = setOf(Coordinate(0, 1), Coordinate(2, 1), Coordinate(0, 0)))

        val actual = world.toWorldData( /* topLeftCoordinate = Coordinate(), bottomRightCoordinate = Coordinate() */)

        val expected = listOf(
            listOf(true, false, false),
            listOf(true, false, true),
            listOf(false, false, false),
        )
        assertEquals(expected, actual)
    }

    @Test
    fun `world is created from world data`() {
        val data = listOf(
            listOf(true, false, false),
            listOf(true, false, true),
            listOf(false, false, false),
        )
        val actual = World.from(data)

        val expected = World(aliveCellCoordinates = setOf(Coordinate(0, 1), Coordinate(2, 1), Coordinate(0, 0)))
        assertEquals(expected, actual)
    }

    @Test
    fun `evolve an empty world`() {
        val emptyWorld = World(aliveCellCoordinates = emptySet())

        val actual = emptyWorld.evolve()

        assertEquals(World(aliveCellCoordinates = emptySet()), actual)
    }

    @Test
    fun `evolve a world with a single alive cell who die for loneliness`() {
        val singleAliveCellWorld = World(aliveCellCoordinates = setOf(Coordinate(1, 1)))

        val actual = singleAliveCellWorld.evolve()

        assertEquals(World(aliveCellCoordinates = emptySet()), actual)
    }

    @Test
    fun `evolve a world with a four closed alive cells who remain alive`() {
        val startingWorld = World(aliveCellCoordinates = setOf(
            Coordinate(1, 0), Coordinate(2, 0),
            Coordinate(1, 1), Coordinate(2, 1)
        ))

        val actual = startingWorld.evolve()

        assertEquals(World(aliveCellCoordinates = setOf(
            Coordinate(1, 0), Coordinate(2, 0),
            Coordinate(1, 1), Coordinate(2, 1)
        )), actual)
    }
}