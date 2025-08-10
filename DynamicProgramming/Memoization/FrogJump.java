public class FrogJump {
    public static void main(String[] args){
        int n=5;
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        System.out.println(frogJump(n, dp));
    }
    public static int frogJump(int n, int[] dp) {
        if (n <= 1) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int oneStep = frogJump(n - 1, dp) + Math.abs(n - (n - 1));
        int twoSteps = Integer.MAX_VALUE;
        if (n > 1) {
            twoSteps = frogJump(n - 2, dp) + Math.abs(n - (n - 2)); // Jump from n-2 to n
        }
        dp[n] = Math.min(oneStep, twoSteps);
        return dp[n];
    }
}
