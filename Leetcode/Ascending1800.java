package Leetcode;

public class Ascending1800 {
    public static void main(String[] args){
        int[] arr={10,20,30,5,10,50};
        int sum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                sum+=arr[i];
            }
            else{
                maxSum=Math.max(maxSum,sum);
                sum=arr[i];
            }
        }
        maxSum=Math.max(maxSum,sum);
        System.out.println(maxSum);
    }
}
