package Searching;

public class CharSearch {
    public static void main(String[] args){
        String str="SivaRamaTeja";
        char target='S';
        System.out.println(Search(str,target));
    }
    static boolean Search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
