import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {
        printBoard();
        computerMove();
        System.out.println("\nAfter computer move:\n");
        printBoard();
    }

    // UC7: Computer random valid move
    static void computerMove() {
        Random rand = new Random();
        int slot;
        int row, col;

        while (true) {
            // Generate slot 1–9
            slot = rand.nextInt(9) + 1;

            // Convert slot → row, col
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Check if cell is empty
            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    // Print board
    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }
}
