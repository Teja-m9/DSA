package Leetcode;
import java.util.*;
public class Third414 {
    public static void main(String[] args){
        int[] arr={1,3,2};
        Set<Integer> set=new HashSet<>();
        for(int n:arr){
            set.add(n);
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
        if(list.size()<3){
            System.out.println(list.get(0));
        }
        else{
            System.out.println(list.get(2));
        }
    }
}
