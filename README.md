# GameOfLife

An implementation of [Conway's Game of Life](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life) in Kotlin language.

### Rules

You have a grid of cells in 2 dimensions.
Each cell has 2 possible states, alive or dead.
Each cell has 8 neighbours: above, below, left, right, and the 4 diagonals.

- any life cell < 2 neighbours dies
- any life cell > 3 neighbours dies
- any live cell with 2 or 3 neighbours lives to next generation
- any dead cell with exactly 3 live neighbours becomes a live cell
