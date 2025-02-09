package Leetcode;
import java.util.*;
public class Sorted977 {
    public static void main(String[] nums){
        int[] arr={-4,-1,0,3,10};
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i]*arr[i];
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}
