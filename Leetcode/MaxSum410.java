package Leetcode;
public class MaxSum410 {
    public static void main(String[] args){
        int[] arr={7,2,5,10,8};
        int k=2;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int peices=1;
            for(int num:arr){
                if(sum+num>mid){
                    sum=num;
                    peices++;
                }
                else{
                    sum+=num;
                }
            }
            if(peices>k){
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
        System.out.println(end);
    }
}
