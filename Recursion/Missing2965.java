package Recursion;
import java.util.*;
public class Missing2965 {
    public static void main(String[] args){
        int[][] arr={
            {1,3},
            {2,2}
        };
        int n=arr.length;
        System.out.println(Arrays.toString(missing(arr,n)));
    }
    public static int[] missing(int[][] arr,int n){
        int total=n*n;
        int[] nums=new int[total+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nums[arr[i][j]]++;
            }
        }
        int repeat=-1;
        int miss=-1;
        for(int i=1;i<=total;i++){
            if(nums[i]==2){
                repeat=i;
            }
            else if(nums[i]==0){
                miss=i;
            }
        }
        return new int[]{repeat,miss};
    }
}
