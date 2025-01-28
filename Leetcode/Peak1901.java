package Leetcode;
public class Peak1901 {
    public static void main(String[] args){
        int[][] mat={
            {1,4},
            {3,2}
        };
    int start=0;
    int end=mat[0].length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        int row=findElement(mat,mid);
        int left=mid-1>=0?mat[row][mid-1]:Integer.MIN_VALUE;
        int right=mid+1<mat[0].length?mat[row][mid+1]:Integer.MIN_VALUE;
        int up=row-1>=0?mat[row-1][mid]:Integer.MIN_VALUE;
        int down=row+1<mat.length?mat[row+1][mid]:Integer.MIN_VALUE;
        if(mat[row][mid]>left&&mat[row][mid]>right&&mat[row][mid]>up&&mat[row][mid]>down){
            System.out.println("Peak Element : ["+row+","+mid+"]");
            return;
        }
        else if(mat[row][right]>left){
            start=mid+1;

        }
        else{
            end=mid-1;
        }
    }
}
public static int findElement(int[][] mat,int col){
    int max=Integer.MIN_VALUE;
    int row=-1;
    for(int i=0;i<mat.length;i++){
        if(mat[i][col]>max){
            max=mat[i][col];
            row=i;
        }
    }
    return row;
}
}
