package lld_design_patterns.case_studies.tic_tac_toe;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
        // Out of bounds check
        if (row < 0 || row >= size || column < 0 || column >= size) {
            return false;
        }
        // Check if the cell is already occupied
        if (board[row][column] != null) {
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }

    public List<int[]> getFreeCells() {
        List<int[]> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeCells.add(new int[]{i, j});
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].type.name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
