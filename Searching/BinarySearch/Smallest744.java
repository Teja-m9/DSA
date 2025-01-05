package Searching.BinarySearch;

public class Smallest744 {
    public static char Smallest(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
            return letters[start%letters.length];
    }
    public static void main(String[] args){
        char[] letters={'c','f','j'};
        char target='a';
        System.out.println(Smallest(letters,target));
        
    }
}
