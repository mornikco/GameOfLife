data class World(private val aliveCellCoordinates: Set<Coordinate> = emptySet()) {

    fun evolve(): World {
        val evolvedAliveCellCoordinates = mutableSetOf<Coordinate>()

        aliveCellCoordinates.forEach { actual ->
            val aliveNeighbours = countAliveNeighbours(actual)
            if (aliveNeighbours == 2 || aliveNeighbours == 3)
                evolvedAliveCellCoordinates.add(actual)
        }
        return World(evolvedAliveCellCoordinates)
    }

    private fun countAliveNeighbours(actual: Coordinate): Int {
        val neighboursState = listOf(
            aliveCellCoordinates.contains(Coordinate(actual.x-1, actual.y-1)),
            aliveCellCoordinates.contains(Coordinate(actual.x-1, actual.y)),
            aliveCellCoordinates.contains(Coordinate(actual.x-1, actual.y+1)),
            aliveCellCoordinates.contains(Coordinate(actual.x, actual.y-1)),
            aliveCellCoordinates.contains(Coordinate(actual.x, actual.y+1)),
            aliveCellCoordinates.contains(Coordinate(actual.x+1, actual.y-1)),
            aliveCellCoordinates.contains(Coordinate(actual.x+1, actual.y)),
            aliveCellCoordinates.contains(Coordinate(actual.x+1, actual.y+1)),
        )

        return neighboursState.count { it }
    }

    fun toWorldData(): WorldData {
        return listOf(
            listOf(aliveCellCoordinates.contains(Coordinate(0,0)), aliveCellCoordinates.contains(Coordinate(1,0)), aliveCellCoordinates.contains(Coordinate(2,0))),
            listOf(aliveCellCoordinates.contains(Coordinate(0,1)), aliveCellCoordinates.contains(Coordinate(1,1)), aliveCellCoordinates.contains(Coordinate(2,1))),
            listOf(aliveCellCoordinates.contains(Coordinate(0,2)), aliveCellCoordinates.contains(Coordinate(1,2)), aliveCellCoordinates.contains(Coordinate(2,2))),
        )
    }

    companion object {
        fun from(worldData: WorldData): World {
            val aliveCellCoordinates = mutableSetOf<Coordinate>()
            worldData.forEachIndexed { y, row ->
                row.forEachIndexed { x, value ->
                    if(value) aliveCellCoordinates.add(Coordinate(x, y))
                }
            }
            return World(aliveCellCoordinates)
        }
    }

}
