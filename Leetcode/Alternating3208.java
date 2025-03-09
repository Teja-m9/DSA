package Leetcode;
import java.util.*;
public class Alternating3208 {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,0};
        int k=3;
        int n=arr.length;
        int[] temp=new int[n+k-1];
        System.arraycopy(arr,0,temp,0,n);
        System.arraycopy(arr,0,temp,n,k-1);
        System.out.println(Arrays.toString(temp));
        int count = 0;
        int left = 0;for (int right = 0; right < temp.length; right++) {
            if (right > 0 && temp[right] == temp[right - 1]) {
                left = right;  
            }
            if (right - left + 1 >= k) {
                count++;  
            }
        }
        System.out.println(count);
    }
}
