package lld_design_patterns.case_studies.tic_tac_toe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    public void initializeGame() {
        // Creating 2 Players
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtsPiece);

        players.add(player1);
        players.add(player2);

        // Initialize Board
        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        Scanner inputScanner = new Scanner(System.in);
        
        while (noWinner) {
            // Take out the player whose turn is it and also put the player back in the list
            Player playerTurn = players.removeFirst();

            // Check for free space
            gameBoard.printBoard();
            List<int[]> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            // Read user input
            System.out.print("Player: " + playerTurn.getName() + " Enter row,column: ");
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // Place piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.getPlayingPiece());
            if (!pieceAddedSuccessfully) {
                // Player couldn't place the piece, add them back to the front of the queue to try again
                System.out.println("Incorrect position chosen, try again!");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            // Check for winner
            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().type);
            if (winner) {
                gameBoard.printBoard();
                return playerTurn.getName();
            }
        }
        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // Check in row
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].type != pieceType) {
                rowMatch = false;
                break;
            }
        }

        // Check in column
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].type != pieceType) {
                columnMatch = false;
                break;
            }
        }

        // Check diagonals
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        // Check anti-diagonals
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
