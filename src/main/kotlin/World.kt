class World {
    fun evolve(): World {
        return World()
    }

    fun toWorldData(): WorldData {
        return listOf(
            listOf(false, false, false),
            listOf(false, false, false),
            listOf(false, false, false),
        )
    }

    companion object {
        fun from(worldData: WorldData): World {
            return World()
        }
    }

}
