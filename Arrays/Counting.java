package Arrays;
import java.util.*;
public class Counting {
    public static void main(String[] args){
        int[] arr={1,1,1,2,3,4,5};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
