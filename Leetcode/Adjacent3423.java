import java.util.*;
public class Adjacent3423 {
    public static void main(String[] args){
        int[] arr={1,2,4};
        int n=arr.length-1;
        int diff=Math.abs(arr[0]-arr[n]);
        int ans=diff;
        for(int i=1;i<arr.length;i++){
            int d=Math.abs(arr[i]-arr[i-1]);
            ans=Math.max(ans, d);
        }
        System.out.println(ans);
    }
}
