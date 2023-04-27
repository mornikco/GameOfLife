fun evolve(startingWorld:String):String {
    val world = WorldDeserializer().from(startingWorld)
    // --- val evolvedWorld = world.evolve()
    // --- return evolvedWorld.toString()

    return World().toString()
}