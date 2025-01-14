package Leetcode;
import java.util.*;
public class Mismatch645 {
    public static void main(String[] args){
        int[] arr={1,1};
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                list.add(arr[j]);
                list.add(j+1);
            }
        }
        int[] nums=new int[list.size()];
        for(int k=0;k<list.size();k++){
            nums[k]=list.get(k);
        }
        System.out.print(Arrays.toString(nums));
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
