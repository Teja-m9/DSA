package Leetcode;

public class Perfect367 {
    public static void main(String[] args){
        int num=16;
        if(num<0){
            System.out.println("False");
        }
        int start=1;
        int end=num;
        while(start<=end){
            int mid=start+(end-start)/2;
            long squared=(long)mid*mid;
            if(squared==num){
                System.out.println("True");
                break;
            }
            else if(squared<num){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

    }
}
