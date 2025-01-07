package Searching.BinarySearch;
import java.util.*;
public class First {
    public static int[] SearchRange(int[]arr,int target){
        int[] ans={-1,-1};
        int start=Search(arr,target,true);
        int end=Search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    public static int Search(int[] arr,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(SearchRange(arr,target)));
    }
}
