package Leetcode;
import java.util.*;
public class Rank1331 {
    public static void main(String[] args){
    int[] arr={40,10,20,30};
    int[] nums=new int[arr.length];
    for(int k=0;k<arr.length;k++){
        nums[k]=arr[k];
    }
    Arrays.sort(nums);
    Hashtable<Integer,Integer> hash=new Hashtable<>();
    int j=1;
    for(int i=0;i<nums.length;i++){
        if(!hash.containsKey(nums[i])){
            hash.put(nums[i],j++);
        }
    }
    int[] arr1=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        arr1[i]=arr[i];
    }
}
}
