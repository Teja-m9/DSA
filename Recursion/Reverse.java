package Recursion;

public class Reverse {
    public static void main(String[] args){
        int n=5;
        printNo(n);
    }
    public static void printNo(int n){
        if(n==0){
            return;
        }
        printNo(n-1);
        System.out.print(n+" ");
    }
}
