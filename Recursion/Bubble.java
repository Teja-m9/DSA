package Recursion;
import java.util.*;
public class Bubble {
    public static void main(String[] args){
        int[] arr={4,3,2,1};
        System.out.println(Arrays.toString(bubble(arr,arr.length-1,0)));
    }
    public static int[] bubble(int[] arr,int r,int c){
        if(r==0){
            return arr; 
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            return bubble(arr,r,c+1);
        }
        else{
            return bubble(arr,r-1,0);
        }
    }
    

}
