package Leetcode;
import java.util.*;
public class Triangle976 {
    public static void main(String[] args){
        int[] arr={2,1,2};
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=2;i--){
            int a=arr[i];
            int b=arr[i-1];
            int c=arr[i-2];
            if(a<b+c){
                System.out.println(a+b+c);
                break;
            }
        }
    }
}
