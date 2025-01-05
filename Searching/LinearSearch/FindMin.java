package Searching.LinearSearch;

public class FindMin {
    public static void main(String[] args){
        int[] arr={1,2,3,95,-100,-3};
        System.out.println(Search(arr));
    }
    public static int Search(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
