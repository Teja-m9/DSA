package Leetcode;

public class MaxScore1422{
    public static void main(String[] args){
        String s="011101";
        System.out.println(MaxScore(s));
    }
    public static int MaxScore(String s){
        int leftZeros = 0;
        int rightOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                rightOnes++;
            }
        }
        int maxScore = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            }
            if (s.charAt(i) == '1') {
                rightOnes--;
            }
            int score = leftZeros + rightOnes;
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}