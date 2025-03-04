package Recursion;

public class Plaindrome {
    public static void main(String[] args){
        int n=12321;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        if(n==rev(n)){
            return true;
        }
        return false;
    }
    public static int rev(int n){
        if(n==0){
            return 0;
        }
        return n%10+rev(n/10)*10;
    }
}
