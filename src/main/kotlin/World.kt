class World(private val aliveCellCoordinates: List<Coordinate> = emptyList()) {

    fun evolve(): World {
        return World()
    }

    fun toWorldData(): WorldData {
        val oneXOneYValue = aliveCellCoordinates.contains(Coordinate(1,1))
        return listOf(
            listOf(false, false, false),
            listOf(false, oneXOneYValue, false),
            listOf(false, false, false),
        )
    }

    companion object {
        fun from(worldData: WorldData): World {
            return World()
        }
    }

}
