package Leetcode;

public class Special3151 {
    public static void main(String[] args){
        int[] arr={2,1,4};
        for(int i=1;i<arr.length;i++){
            if(arr[i]%2==arr[i-1]%2){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
