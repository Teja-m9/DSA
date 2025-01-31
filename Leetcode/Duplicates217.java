package Leetcode;
import java.util.*;
public class Duplicates217 {
    public static void main(String[] args){
        int[] arr={1,2,3,1};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("True");
                return;
            }
            else{
                set.add(i);
            }
        }
        System.out.println("False");
    }
}
