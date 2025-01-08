package Leetcode;

public class Even1295 {
    public static void main(String[] args){
        int[] arr={12,345,2,6,7896};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(isEven(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isEven(int n){
        if(countOfDigits(n)%2==0){
            return true;
        }
        return false;
    }
    public static int countOfDigits(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
}

