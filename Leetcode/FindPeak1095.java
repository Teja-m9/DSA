package Leetcode;

public class FindPeak1095 {
    public static int Peak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int OrderAgnosticBS(int[] arr,int target,int start,int end){
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
    public static int Search(int[] arr,int target){
        int peak=Peak(arr);
        int firstTry=OrderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return OrderAgnosticBS(arr,target,peak+1,arr.length-1);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target=10;
        System.out.println(Search(arr,target));
    }
}


