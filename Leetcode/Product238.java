package Leetcode;
import java.util.*;
//https://leetcode.com/problems/product-of-array-except-self/description/
public class Product238 {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int[] nums=new int[arr.length];
        int left=1;
        for(int i=0;i<arr.length;i++){
            nums[i]=left;
            left*=arr[i];
        }
        int right=1;
        for(int i=arr.length-1;i>=0;i--){
            nums[i]*=right;
            right*=arr[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
