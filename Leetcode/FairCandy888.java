package Leetcode;
import java.util.HashSet;
import java.util.*;
public class FairCandy888 {
    public static void main(String[] args){
        int[] a={1,2};
        int[] b={2,3};
        int sum=0;
        int sum1=0;
        for(int i:a){
            sum+=i;
        }
        for(int i:b){
            sum1+=i;
        }
        int d=(sum-sum1)/2;
        HashSet<Integer> has=new HashSet<>();
        for(int i:b){
            has.add(i);
        }
        for(int i:a){
            int j=i-d;
            if(has.contains(j)){
                System.out.print(i+" "+j);
                return;
            }
        }
    }
}
