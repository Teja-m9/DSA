package Arrays;
import java.util.*;
public class MoveZeros {
    public static void main(String[] args){
        int[] arr={0,1,0,3,12};
        int n=arr.length;
        int j=0;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j++]=arr[i];
            }
        }
        while(j<n){
            temp[j++]=0;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
