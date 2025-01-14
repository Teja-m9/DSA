package Leetcode;
import java.util.*;
public class Duplic442 {
    public static void main(String[] args){
        int[] arr={4,3,2,7,8,2,3,1};
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
            }
        }
        System.out.println(list);
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
