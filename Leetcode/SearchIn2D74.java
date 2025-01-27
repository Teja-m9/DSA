package Leetcode;

public class SearchIn2D74 {
    public static void main(String[] args){
        int[][] matrix={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,64,60}
        };
        int target=100;
        int n=matrix.length;
        int m=matrix[0].length;
        int start=0;
        int end=n*m-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int row=mid/m,col=mid%m;
            if(matrix[row][col]==target){
                System.out.println("Element found");
                return;
            }
            else if(matrix[row][col]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("Element not found");
    }
}
