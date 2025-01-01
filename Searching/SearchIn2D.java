package Searching;
import java.util.*;

public class SearchIn2D {
    public static void main(String[] args){
        int[][] arr={
            {1,2,4},
            {100,1000,12,-3},
            {0,5,3,1,200}
        };
        int target=200;
        System.out.println(Arrays.toString(Search(arr,target)));
    }
    public static int[] Search(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
