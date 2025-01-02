package Leetcode;
import java.util.*;
public class Smaller1365 {
    public static void main(String[] args){
        int[] arr={8,1,2,2,3};
        int[] nums=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            nums[i]=count;
        }
        System.out.println(Arrays.toString(nums));
    }
}
