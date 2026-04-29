public static void main(String[] args) {

    while (!gameOver) {

        if (isHumanTurn) {
            System.out.println("Human's Turn");
            // call function to take human input
            makeHumanMove();
        } else {
            System.out.println("Computer's Turn");
            // call function for AI move
            makeComputerMove();
        }

        // Check win condition
        if (checkWin()) {
            System.out.println((isHumanTurn ? "Human" : "Computer") + " wins!");
            gameOver = true;
        }
        // Check draw condition
        else if (checkDraw()) {
            System.out.println("Game is a draw!");
            gameOver = true;
        }
        // Switch turn
        else {
            isHumanTurn = !isHumanTurn;
        }
    }
}
