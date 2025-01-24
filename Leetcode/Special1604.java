package Leetcode;
public class Special1604 {
    public static void main(String[] args){
        int[] arr={0,4,3,0,4};
        int ans=-1;
        int count=0;
        for(int i=0;i<=arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>=i){
                    count++;
                }
            }
            if(count==i){
                ans=count;
                break;
            }
        }
        System.out.println(ans);
    }
}
