import java.util.Arrays;

public class Robber {
    public static void main(String[] args){
        int[] arr={1, 2, 3, 1};
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp, -1);
        System.out.println(maxRob(arr, n - 1, dp));
    }
    public static int maxRob(int[] arr,int i,int[] dp){
        if(i==0){
            return arr[i];
        }
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick=arr[i] + maxRob(arr, i - 2, dp);
        int notPick=maxRob(arr, i - 1, dp);
        dp[i] = Math.max(pick, notPick);
        return dp[i];
    }
}
