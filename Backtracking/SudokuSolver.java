public class SudokuSolver {
    public static void main(String[] args){
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solve(board)){
            display(board);
        } else {
            System.out.println("No solution exists");
        }
    }
    static boolean solve(int[][] board){
        int n=board.length;
        int r=-1;
        int c=-1;
        boolean isEmpty=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    r=i;
                    c=j;
                    isEmpty=false;
                    break;
                }
            }
            if(!isEmpty){
                break;
            }
        }
        if(isEmpty){
            return true;
        }
        for(int num=1;num<=9;num++){
            if(isSafe(board,r,c,num)){
                board[r][c]=num;
                if(solve(board)){
                    return true;
                }
                else{
                    board[r][c]=0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board,int r,int c,int num){
        for(int i=0;i<board.length;i++){
            if(board[r][i]==num){
                return false;
            }
        }
        for(int[] nums:board){
            if(nums[c]==num){
                return false;
            }
        }
        int sqrt=(int)Math.sqrt(board.length);
        int rowStart=r-r%sqrt;
        int colStart=c-c%sqrt;
        for(int ro=rowStart;ro<rowStart+sqrt;ro++){
            for(int co=colStart;co<colStart+sqrt;co++){
                if(board[ro][co]==num){
                    return false;
                }
            }
        }
        return true;

    }
    private static void display(int[][] board){
        for(int[] row:board){
            for(int num:row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
