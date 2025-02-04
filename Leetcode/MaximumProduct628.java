package Leetcode;
import java.util.*;
public class MaximumProduct628 {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int n=arr.length;
        Arrays.sort(arr);
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
        if(n==2){
            System.out.println(arr[0]*arr[2]);
            return;
        }
        if(n==3){
            System.out.println(arr[0]*arr[1]*arr[2]);
            return;
        }
        int result=Math.max(arr[n-1]*arr[n-2]*arr[n-3],arr[0]*arr[1]*arr[3]);
        System.out.println(result);
    }
}
