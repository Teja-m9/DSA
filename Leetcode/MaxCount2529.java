package Leetcode;

public class MaxCount2529 {
    public static void main(String[] args){
        int[] arr={-1,-2,-3,1,2,3};
        int max=0;
        int posCount=0;
        int negCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posCount++;
            }
            else if(arr[i]<0){
                negCount++;
            }
        }
        max=Math.max(posCount,negCount);
        System.out.println(max);
    }
}
