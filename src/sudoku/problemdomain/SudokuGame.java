package sudoku.problemdomain;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }

    private final GameState gameState;
    private final int [][] gridState;

    public static final int RID_BOUNDARY = 9;
}
