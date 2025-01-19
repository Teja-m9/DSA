package Leetcode;

public class Count1351 {
    public static void main(String[] args){
        int[][] matrix={
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {-1,-1,-2,-3}
        };
        int count=0;
        int r=matrix.length-1;
        int c=matrix[0].length-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[r][c]<0){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
