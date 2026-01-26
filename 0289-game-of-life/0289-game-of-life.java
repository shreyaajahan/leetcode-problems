class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;

        // Extra matrix to store next state
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = board[i][j]; // current cell
                int count = 0;       // live neighbors

                // Check all 8 neighbors

                if (i > 0 && board[i - 1][j] == 1) count++;          // up
                if (i < n - 1 && board[i + 1][j] == 1) count++;     // down
                if (j > 0 && board[i][j - 1] == 1) count++;         // left
                if (j < m - 1 && board[i][j + 1] == 1) count++;     // right

                if (i > 0 && j > 0 && board[i - 1][j - 1] == 1) count++;           // top-left
                if (i < n - 1 && j < m - 1 && board[i + 1][j + 1] == 1) count++;   // bottom-right
                if (i > 0 && j < m - 1 && board[i - 1][j + 1] == 1) count++;       // top-right
                if (i < n - 1 && j > 0 && board[i + 1][j - 1] == 1) count++;       // bottom-left

                // Apply Game of Life rules
                if (a == 1 && count < 2) {
                    arr[i][j] = 0;                 // underpopulation
                } else if (a == 1 && (count == 2 || count == 3)) {
                    arr[i][j] = 1;                 // lives
                } else if (a == 1 && count > 3) {
                    arr[i][j] = 0;                 // overpopulation
                } else if (a == 0 && count == 3) {
                    arr[i][j] = 1;                 // reproduction
                } else {
                    arr[i][j] = 0;                 // remains dead
                }
            }
        }

        // Copy next state back to board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = arr[i][j];
            }
        }
    }
}
