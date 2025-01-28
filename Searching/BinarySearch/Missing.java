package Searching.BinarySearch;

public class Missing {
    public static void main(String[] args){
        int[] arr={2,3,4,7,11};
        int k=5;
        int start=0;
        int end=arr.length-1;
        int res=arr.length+k;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>mid+k){
                res=mid+k;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(res);
    }
}
