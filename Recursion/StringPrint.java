package Recursion;

public class StringPrint {
    public static void PrintStirng(int n){
        if(n==0){
            return;
        }
        System.out.println("HI!Siva");
        PrintStirng(n-1);
    }
    public static void main(String[] args){
        int n=10;
        PrintStirng(n);
    }
}
