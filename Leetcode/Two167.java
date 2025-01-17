package Leetcode;
import java.util.*;
public class Two167 {
    public static void main(String[] args){
        int[] num={2,7,11,13};
        int target=9;
        int[] arr=new int[2];
        int sum=0;
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                sum=num[i]+num[j];
                if(sum==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
