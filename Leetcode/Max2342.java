package Leetcode;
import java.util.*;
public class Max2342 {
    public static void main(String[] args){
            int[] arr={10,12,19,14};
            int max=-1;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length-1;j++){
                    if(sumOfDigits(arr[i])==sumOfDigits(arr[j])){
                        sum=arr[i]+arr[j];
                        max=Math.max(sum,max);
                    }
                }
            }
            System.out.println(max);
        }
        public static int sumOfDigits(int n){
            int sum=0;
            while(n!=0){
                int rem=n%10;
                sum+=rem;
                n=n/10;
            }
            return sum;
        }
}