package Leetcode;

public class Minimum2379 {
    public static void main(String[] args){
        String s1="WBBWWBBWBW";
        int k=7;
        int n=s1.length();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int white=0;
            for(int j=i;j<i+k;j++){
                if(s1.charAt(j)=='W'){
                    white++;
                }
            }
            min=Math.min(min,white);
        }
        System.out.println(min);
    }
}
