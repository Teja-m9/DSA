package Arrays;
public class second_largest {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,10,10};
        int max=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>second_largest&&arr[i]!=max){
                second_largest=arr[i];
            }
        }
        System.out.println(second_largest);
    }
}
