package Searching.BinarySearch;

public class SortedMatrix {
    public static void main(String[] args){
        int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48}
        };
        int target=29;
        int n=arr.length,m=arr[0].length;
        int start=0,end=(n*m)-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int row=mid/m;
            int col=mid%m;
            if(arr[row][col]==target){
                System.out.println("Element found at "+row+" "+col);
                return;
            }
            if(arr[row][col]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("Element not found");
    }
}
