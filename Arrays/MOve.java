package Arrays;
import java.util.*;
public class MOve {
    public static void main(String[] args){
        int[] arr={1,2,0,3,4,0,5,0};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<n){
            arr[count++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
