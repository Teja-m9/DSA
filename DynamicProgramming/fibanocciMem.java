import java.util.Arrays;

public class fibanocciMem {
    public static void main(String[] args){
        int n=10;
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        System.out.println(fib(n, dp));
    }
    public static int fib(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n]; // Return the cached result
        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
}
