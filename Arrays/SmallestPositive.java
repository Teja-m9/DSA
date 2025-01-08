package Arrays;
import java.util.Arrays;
public class SmallestPositive {
    public static void main(String[] args){
        int[] arr={2,-3,4,1,1,7};
        int n=arr.length;
        int res=1;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==res){
                res++;
            }
            else if(arr[i]>res){
                break;
            }
        }
        System.out.println(res);
    }
}
