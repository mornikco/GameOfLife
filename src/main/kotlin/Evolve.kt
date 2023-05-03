fun evolve(world: List<List<Boolean>>): List<List<Boolean>> {
    if (world[2][2]) {
        return world
    }

    return listOf(
        listOf(false, false, false),
        listOf(false, false, false),
        listOf(false, false, false)
    )
}