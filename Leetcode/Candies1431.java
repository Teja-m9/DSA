package Leetcode;
import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int total = candies[i] + extraCandies;
            if (total >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result); 
    }
}
