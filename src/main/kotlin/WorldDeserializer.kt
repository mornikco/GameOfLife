class WorldDeserializer {
    fun from(worldString: String): World {
        val aliveCoordinates = worldString
            .split("\n")
            .mapIndexed { y, row ->
                row.mapIndexed { x, cellChar ->
                    if (cellChar == World.ALIVE_CELL_CHAR)
                        Coordinate(x, y)
                    else
                        null
                }
            }
            .flatten()
            .filterNotNull()
        return World(aliveCoordinates)
    }

}
