package Leetcode;
import java.util.*;
//https://leetcode.com/problems/spiral-matrix-ii/submissions/1509499468/
public class Spiral59 {
    public static void main(String[] args){
        int n=3;
        int[][] matrix=new int[n][n];
        int sr=0;
        int sc=0;
        int r=n-1;
        int c=n-1;
        int num=1;
        while(sr<=r&&sc<=c){
            for(int i=sc;i<=c;i++){
                matrix[sr][i]=num++;
            }
            for(int i=sr+1;i<=r;i++){
                matrix[i][c]=num++;
            }
            for(int i=c-1;i>=sc;i--){
                matrix[r][i]=num++;
            }
            for(int i=r-1;i>=sr+1;i--){
                matrix[i][sc]=num++;
            }
            sr++;
            sc++;
            r--;
            c--;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
