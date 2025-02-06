package Leetcode;
import java.util.*;
public class Sort905{
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        int[] nums=new int[arr.length];
        int j=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                nums[j]=arr[i];
                count=j+1;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                nums[count]=arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}