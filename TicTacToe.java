static boolean isDraw() {

    // Traverse entire board
    for (int r = 0; r < 3; r++) {
        for (int c = 0; c < 3; c++) {

            // If any empty cell exists → not a draw
            if (board[r][c] == '-') {
                return false;
            }
        }
    }

    // No empty cells left → draw
    return true;
}

