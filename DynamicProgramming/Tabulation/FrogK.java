import java.util.*;
public class FrogK {
    public static void main(String[] args){
        int[] heights={10, 30, 40, 20, 50};
        int n=heights.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int k=3;
        System.out.println(Solve(n, heights, k, dp));
    }
    public static int Solve(int n,int[] heights,int k,int[] dp){
        dp[0]=0;
        for(int i=1;i<n;i++){
            int minJumps=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                if(i-j>=0){
                    int minSteps=dp[i-j]+Math.abs(heights[i]-heights[i-j]);
                    minJumps=Math.min(minJumps, minSteps);
                }   
            }
            dp[i]=minJumps;
        }
        return dp[n-1];
    }
}
