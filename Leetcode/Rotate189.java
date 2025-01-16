package Leetcode;
import java.util.*;
public class Rotate189 {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        int n=nums.length;
        int[] arr=new int[n];
        k=k%n;
        for(int i=0;i<k;i++){
            arr[i]=nums[n-k+i];
        }
        for(int i=k;i<n;i++){
            arr[i]=nums[i-k];
        }
        System.out.println(Arrays.toString(arr));
    }
}
