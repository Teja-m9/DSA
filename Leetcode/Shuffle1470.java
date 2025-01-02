package Leetcode;
import java.util.*;

public class Shuffle1470 {
    public static void main(String[] args){
        int[] arr={2,5,1,3,4,7};
        int n=3;
        int index=0;
        int[] nums=new int[arr.length];
        for(int i=0;i<n;i++){
            nums[index]=arr[i];
            nums[index+1]=arr[i+n];
            index+=2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
