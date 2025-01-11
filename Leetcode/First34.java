package Leetcode;

import java.util.Arrays;

public class First34 {
    public static void main(String[] args) {
        int[] arr={5,4,7,8,8,10};
        int target=7;
        int[] ans={-1,-1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans[0]=i;
                break;
            }
        }
        if(ans[0]!=-1){
            boolean found=false;
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]==target){
                    if(i!=ans[0]){
                        ans[1]=i;
                        found=true;
                    }
                    break;
                }
            }
            if(!found){
                ans[1]=-1;
            }
        }
        System.out.print(Arrays.toString(ans));
    }
}
