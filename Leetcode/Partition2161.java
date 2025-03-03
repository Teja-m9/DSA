package Leetcode;
import java.util.*;
public class Partition2161 {
    public static void main(String[] args){
        int[] arr={9,12,5,10,14,3,10};
        int pivot=10;
        int index=0;
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<pivot){
                res[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==pivot){
                res[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>pivot){
                res[index]=arr[i];
                index++;
            }
        }
        System.out.println("Partitioned array:"+Arrays.toString(res));
    }
}
