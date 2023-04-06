import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LifeRuleTest {

    private val rule = LifeRule()

    @Test
    fun `living cell with fewer than 2 living neighbors dies of loneliness`() {
        val nextStateWithZeroAliveNeighbors = rule.nextStateFor(currentState = State.ALIVE, aliveNeighbors = 0)
        assertEquals(State.DEAD, nextStateWithZeroAliveNeighbors)
        val nextStateWithOneAliveNeighbor = rule.nextStateFor(currentState = State.ALIVE, aliveNeighbors = 1)
        assertEquals(State.DEAD, nextStateWithOneAliveNeighbor)
    }

    //fun `living cell with more than 3 living neighbors dies of overcrowdness`() {
}