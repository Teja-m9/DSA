package Leetcode;

import java.util.Arrays;

public class buildArray {
    public static void main(String[] args) {
        int[] nums={5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
}
    public static int[] buildArray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int index=nums[i];
            arr[i]=nums[index];
        }
        return arr;
    }
}
