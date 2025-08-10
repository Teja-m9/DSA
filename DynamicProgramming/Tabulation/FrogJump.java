import java.util.Arrays;
public class FrogJump {
    public static void main(String[] args) {
        int n = 5;
        int[] heights = {10, 30, 40, 20, 50};
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(minEnergy(n - 1, heights, dp));
    }
    public static int minEnergy(int n, int[] heights, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int jumpOne = minEnergy(n - 1, heights, dp) + Math.abs(heights[n] - heights[n - 1]);
        int jumpTwo = Integer.MAX_VALUE;
        if (n > 1) {
            jumpTwo = minEnergy(n - 2, heights, dp) + Math.abs(heights[n] - heights[n - 2]);
        }
        dp[n] = Math.min(jumpOne, jumpTwo);
        return dp[n];
    }
}
