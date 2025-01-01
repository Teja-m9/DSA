package Searching;

public class EvenDigits {
    public static void main(String[] args){
        int[] arr={12,43,209,9,-1000};
        System.out.println(Search(arr));
    }
    public static int Search(int[] arr){
        int count=0;
        if(arr.length==0){
            return -1;
        }
        for(int element : arr){
            if(isEven(element)){
                count++;
            }
        }
        return count;
    }
    public static boolean isEven(int num){
        int count=CountDigits(num);
        if(count%2==0){
            return true;
        }
        return false;
    }
    public static int CountDigits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
