class LifeRule {
    fun nextStateFor(currentState: State, aliveNeighbors: Int): State {
       return State.DEAD
    }

}

enum class State { DEAD, ALIVE}
