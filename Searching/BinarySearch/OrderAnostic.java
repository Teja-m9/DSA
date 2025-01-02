package Searching.BinarySearch;

public class OrderAnostic {
    public static void main(String[] args){
        int[] arr={1,23,45,67,89,123,567,1000};
        int target=123;
        System.out.println(Search(arr,target));
    }
    public static int Search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
