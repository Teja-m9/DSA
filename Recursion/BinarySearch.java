package Recursion;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=5;
        int res=binarySearch(arr,0,arr.length-1,target);
        System.out.println(res);
    }
    public static int binarySearch(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return binarySearch(arr, start, mid-1, target);
            }
            else{
                return binarySearch(arr,mid+1,end,target);
            }
        }
        return -1;
    }
}
