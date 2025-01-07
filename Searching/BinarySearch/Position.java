package Searching.BinarySearch;

public class Position {
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+2)*2;
            start=temp;
        }
        return BinarySearch(arr,target,start,end);
    }
    public static int BinarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,10,90,100,120,140,160,180};
        int target=100;
        System.out.println(ans(arr,target));
    }
}
