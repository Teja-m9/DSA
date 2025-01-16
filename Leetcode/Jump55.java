package Leetcode;

public class Jump55 {
    public static void main(String[] args){
        int[] nums={2,3,1,1,4};
        System.out.println(isJump(nums));
    }
    public static boolean isJump(int[] arr){
        int i=0;
        int max=0;
        while(i<arr.length){
            if(i>max){
                return false;
            }
            max=Math.max(max,i+arr[i]);
            if(max>=arr.length-1){
                return true;
            }
            i++;
        }
        return false;
    }
}
