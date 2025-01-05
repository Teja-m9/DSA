package Searching.LinearSearch;

public class RangeSearch {
    public static void main(String[] args){
        int[] arr={12,43,22,56,78,95};
        int target=12;
        System.out.println(Search(arr,target,1,4));
    }
    public static int Search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
