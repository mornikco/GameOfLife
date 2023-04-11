typealias WorldData = List<List<Boolean>>

fun evolve(worldData: WorldData): WorldData {
    val initialWorld = World.from(worldData)
    val evolvedWorld = initialWorld.evolve()
    return evolvedWorld.toWorldData()
}