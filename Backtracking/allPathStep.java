import java.util.*;
public class allPathStep {
    public static void main(String[] args){
        boolean[][] board={
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path=new int[board.length][board[0].length];
        allPath("",board,0,0,path,1);
    }
    static void allPath(String p,boolean[][] board,int r,int c,int[][] path,int step){
        if(r==board.length-1 && c==board[0].length-1){
            path[r][c]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }if(!board[r][c]){
            return;
        }
        board[r][c]=false;
        path[r][c]=step;
        if(r<board.length-1){
            allPath(p+'D', board, r+1, c, path, step+1);
        }
        if(c<board[0].length-1){
            allPath(p+'R', board, r, c+1, path, step+1);
        }
        if(r>0){
            allPath(p+'U', board, r-1, c, path, step+1);
        }
        if(c>0){
            allPath(p+'L', board, r, c-1, path, step+1);
        }
        board[r][c]=true;
        path[r][c]=0;
    }
}
