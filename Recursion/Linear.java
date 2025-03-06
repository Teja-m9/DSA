package Recursion;

public class Linear {
    public static void main(String[] args){
        int[] arr={1,2,3,4,8,19,200};
        int target=19;
        System.out.println(linear(arr,target,0));
    }
    public static int linear(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return linear(arr,target,index+1);
        }
    }
}
