package Leetcode;
import java.util.*;
public class String2810 {
    public static void main(String[] args){
        String s="poiinter";
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='i'){
                res.reverse();
            }
            else{
                res.append(c);
            }
        }
        System.out.println(res.toString());
    }
}
