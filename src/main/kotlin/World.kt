class World(private val aliveCells: Set<Coordinate> = emptySet()) {

    fun serialize(): List<List<Boolean>> {
        val serialized = mutableListOf<List<Boolean>>()
        for(y in 0 until SERIALIZATION_SIZE) {
            val row = mutableListOf<Boolean>()
            for(x in 0 until SERIALIZATION_SIZE) {
                val isCoordinateAnAliveCell = aliveCells.contains(Coordinate(x, y))
                row.add(isCoordinateAnAliveCell)
            }
           serialized.add(row)
        }
        return serialized
    }

    companion object {
        private const val SERIALIZATION_SIZE = 3
    }

}
