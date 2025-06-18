public class Nknights {
    public static void main(String[] args){
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }

    static void knight(boolean[][] board, int r, int c, int target){
        if(target == 0){
            display(board);
            System.out.println();
            return; // ✅ Added to prevent further recursion after success
        }

        if(r == board.length){
            return; // ✅ Prevent going out of bounds
        }

        if(c == board.length){
            knight(board, r + 1, 0, target); // ✅ Fix: move to next row, reset col
            return; // ✅ Prevent further execution in this call
        }

        if(isSafe(board, r, c)){
            board[r][c] = true;
            knight(board, r, c + 1, target - 1);
            board[r][c] = false;
        }

        knight(board, r, c + 1, target);
    }

    private static boolean isSafe(boolean[][] board, int r, int c){
        if(isValid(board, r - 2, c - 1) && board[r - 2][c - 1]){
            return false;
        }
        if(isValid(board, r - 1, c - 2) && board[r - 1][c - 2]){
            return false;
        }
        if(isValid(board, r - 2, c + 1) && board[r - 2][c + 1]){
            return false;
        }
        if(isValid(board, r - 1, c + 2) && board[r - 1][c + 2]){
            return false;
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int r, int c){
        return r >= 0 && r < board.length && c >= 0 && c < board.length;
    }

    private static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean i : row){
                System.out.print(i ? "K " : "X ");
            }
            System.out.println();
        }
    }
}
