package Leetcode;

public class Highest1732 {
    public static void main(String[] args){
        int[] gain={-5,1,5,0,-7};
        int[] arr=new int[gain.length+1];
        for(int i=0;i<gain.length;i++){
            arr[i+1]=gain[i]+arr[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
