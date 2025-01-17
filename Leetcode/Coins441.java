package Leetcode;

public class Coins441 {
    public static void main(String[] args){
        int n=5;
        int count=0;
        for(int i=1;i<=n;i++){
            n=n-i;
            count++;
        }
        System.out.println(count);
    }
}
