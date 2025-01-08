package Arrays;
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        int[] arr={1,4,3,2,6,5};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
