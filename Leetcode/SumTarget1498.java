public class SumTarget1498 {
    public static void main(String[] args){
        int[] arr={3,5,6,7};
        int target=9;
        int mod=1000000007;
        int n=arr.length;
        int[] power=new int[n];
        power[0]=1;
        for(int i=1;i<n;i++){
            power[i]=(power[i-1]*2)%mod;
        }
        int left=0,right=n-1,res=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum<=target){
                res=(res+power[right-left])%mod;
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(res);
    }
}
