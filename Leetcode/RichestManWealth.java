package Leetcode;

public class RichestManWealth {
    public static void main(String[] args){
        int [][] accounts={
            {1,2,4},
            {5,3,2},
            {1,1,1}
        };
        System.out.println(MaxWealth(accounts));
    }
    public static int MaxWealth(int[][] accounts){
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
