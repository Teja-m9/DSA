package Recursion;

public class Product {
    public static void main(String[] args){
        int n=1341;
        System.out.println(product(n));
    }
    public static int product(int n){
        if(n%10==n){
            return n;
        }
        return n%10*product(n/10);
    }
}
