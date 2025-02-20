package Arrays;
public class Sorted {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                System.out.println("Array is sorted");
                return;
            }
        }
        System.out.println("Array is not sorted");
    }
}
