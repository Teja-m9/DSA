package Leetcode;
import java.util.*;
public class Spiral54 {
    public static void main(String[] args){
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        List<Integer> list=new ArrayList<>();
        int sr=0;
        int sc=0;
        int r=matrix.length-1;
        int c=matrix[0].length-1;
        while(sr<=r&&sc<=c){
            for(int i=sc;i<=c;i++){
                list.add(matrix[sr][i]);
            }
            for(int i=sr+1;i<=r;i++){
                list.add(matrix[i][c]);
            }
            if(sr<r){
            for(int i=c-1;i>=sc;i--){
                list.add(matrix[r][i]);
            }
            }
            if(sc<c){
            for(int i=r-1;i>=sr+1;i--){
                list.add(matrix[i][sc]);
            }
            }
            sr++;
            sc++;
            r--;
            c--;
        }
        System.out.print(list.toString());
    }
}
