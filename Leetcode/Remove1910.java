package Leetcode;
public class Remove1910 {
    public static void main(String[] args){
        String s="abacaba";
        String part="aba";
        while(s.contains(part)){
            s=s.replaceFirst(part, "");
        }
        System.out.println(s);
    }
}
