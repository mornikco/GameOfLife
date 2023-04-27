
data class World(private val aliveCellCoordinates: List<Coordinate> = emptyList()) {

    override fun toString(): String {
        var result = ""
        for (y in 0 until WORLD_VIEW_DIMENSION) {
            for (x in 0 until WORLD_VIEW_DIMENSION) {
                val current = Coordinate(x, y)
                result += if (aliveCellCoordinates.contains(current)) ALIVE_CELL_CHAR else DEAD_CELL_CHAR
            }
            result += "\n"
        }

        return result
    }

    companion object {
        const val ALIVE_CELL_CHAR = 'X'
        const val DEAD_CELL_CHAR = '.'

        private const val WORLD_VIEW_DIMENSION = 3
    }
}
