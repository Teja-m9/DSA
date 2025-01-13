package Leetcode;

public class Duplicate287 {
    public static void main(String[] args){
        int[] arr={1,3,4,2,2};
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }
                else{
                    System.out.println(arr[i]);
                    return;
                }
            }
            else{
                i++;
            }

        }
        System.out.println(-1);
    }
    public static void swap(int[] arr,int start,int second){
        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;

    }
}
