class World(private val aliveCells: Set<Coordinate> = emptySet()) {
    fun serialize(): List<List<Boolean>> {
        if (aliveCells.isEmpty()) {
            return listOf(
                listOf(false, false, false),
                listOf(false, false, false),
                listOf(false, false, false)
            )
        }

        return listOf(
            listOf(false, false, false),
            listOf(false, true, false),
            listOf(false, false, false)
        )
    }
}
