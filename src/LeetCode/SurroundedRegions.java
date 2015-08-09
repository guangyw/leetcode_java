package LeetCode;

//Given a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.
//
//        A region is captured by flipping all 'O's into 'X's in that surrounded region.
//

public class SurroundedRegions {
    public void solve(char[][] board) {
        if (board == null || board.length <= 1 || board[0] == null) return;
        int m = board.length, n = board[0].length;
        int i, j;
        for (i = 0; i < n; i++) {
            if (board[0][i] == 'O') markBoard(board, 0, i);
            if (board[m-1][i] == 'O') markBoard(board, m -1, i);
        }

        for (i = 0; i < m; i++) {
            if (board[i][0] == 'O') markBoard(board, i, 0);
            if (board[i][n -1] == 'O') markBoard(board, i, n -1);
        }

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (board[i][j] == 'U') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void markBoard(char[][] board, int m, int n) {
        board[m][n] = 'U';
        if (m-1 > 0 && board[m-1][n] == 'O') markBoard(board, m-1, n);
        if (m+1 < board.length && board[m+1][n] == 'O') markBoard(board, m+1, n);
        if (n -1 > 0 && board[m][n -1] == 'O') markBoard(board, m, n -1);
        if (n + 1 < board[0].length && board[m][n+1] == 'O') markBoard(board, m, n+1);
    }
}
