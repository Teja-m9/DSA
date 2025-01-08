package Leetcode;
import java.util.*;
public class Total989 {
    public static void main(String[] args){
        int[] num={1,2,0,0};
        int k=34;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length;i++){
            sb.append(num[i]);
        }
        String res=sb.toString();
        List<Integer> list=new ArrayList<>();
        int i=num.length-1;
        while(i>=0 || k>0){
            int sum=(i>=0?num[i]:0)+(k%10);
            list.add(sum%10);
            k/=10;
            i--;
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}

