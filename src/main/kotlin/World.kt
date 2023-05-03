class World(aliveCells: Set<Coordinate> = emptySet()) {
    fun serialize(): List<List<Boolean>> {
        return listOf(
            listOf(false, false, false),
            listOf(false, false, false),
            listOf(false, false, false)
        )
    }
}
