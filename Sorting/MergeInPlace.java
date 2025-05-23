import java.util.*;
public class MergeInPlace {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSortInPlace(int[] arr,int s,int e){
        if((e-s)==1){
            return;
        }
        int m=(s+e)/2;
        mergeSortInPlace(arr, s, m);
        mergeSortInPlace(arr, m, e);
        mergeInplace(arr,s,m,e);
    }
    private static void mergeInplace(int[] arr,int s,int m,int e){
        int i=s;
        int j=m;
        int k=0;
        int[] mix=new int[e-s];
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
}
