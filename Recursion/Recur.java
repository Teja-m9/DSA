package Recursion;
import java.util.*;
public class Recur{
    public static void main(String[] args){
        int[] arr={1,2,3,4,4,6};
        int target=4;
        System.out.println(find(arr,target,0,new ArrayList<>()));

    }
    public static ArrayList<Integer> find(int[] arr,int target,int index,ArrayList<Integer> ans){
        if(index==arr.length){
            return ans;
        }
        if(arr[index]==target){
            ans.add(index);
        }
        return find(arr,target,index+1,ans);
    }
}
