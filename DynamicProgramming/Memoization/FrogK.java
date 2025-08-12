import java.util.Arrays;

public class FrogK {
    public static void main(String[] args){
        int[] heights={10, 30, 40, 20, 50};
        int n=heights.length;
        int k=3;
        System.out.println(Solve(n - 1, heights, k));
    }
    public static int Solve(int n,int [] heights,int k){
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        return solveUtil(n,heights,k,dp);
    }
    public static int solveUtil(int n,int[] heights,int k,int[] dp){
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int minEnergy = Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(n-i>=0){
                int minJump=solveUtil(n-i, heights, k, dp)+Math.abs(heights[n]-heights[n-i]);
                minEnergy = Math.min(minEnergy, minJump);
            }
        }
        return dp[n]=minEnergy;
    }
}
