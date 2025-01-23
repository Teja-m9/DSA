package Leetcode;

import java.util.*;

public class Check1346 {
    public static void main(String[] args){
        int[] arr={10,2,5,4};
        Set<Integer> list=new HashSet<>();
        for(int num:arr){
            if(list.contains(num*2)||(num%2==0&&list.contains(num/2))){
                System.out.print("True");
                return;
            }
            list.add(num);
        }

    }
}
