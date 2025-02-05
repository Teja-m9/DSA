package Leetcode;
import java.util.*;
public class String1790 {
    public static void main(String[] args){
        String s1="bank";
        String s2="kanb";
        if(s1.equals(s2)){
            System.out.println("True");
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                list.add(i);
            }
        }
        if(list.size()==2){
            int i=list.get(0);
            int j=list.get(1);
            if(s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }else{
            System.out.println("Flase");
        }
    }
}
