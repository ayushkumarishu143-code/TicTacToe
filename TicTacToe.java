public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Initialize board first
        initializeBoard();

        // Place a sample move
        placeMove(0, 0, 'X');

        // Print updated board
        printBoard();
    }

    // Initialize board with '-'
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // UC6: Place move on board
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
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
