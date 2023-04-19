class World(private val aliveCellCoordinates: List<Coordinate> = emptyList()) {

    fun evolve(): World {
        return World()
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
            return World()
        }
    }

}
