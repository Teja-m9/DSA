package Leetcode;
class Check1752{
    public static void main(String[] args){
        int[] arr={3,0,5,1,2};
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[(i+1)%arr.length]<arr[i]){
                c++;
            }
            if(c>1){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}