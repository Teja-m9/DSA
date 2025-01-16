package Strings;
public class Palindrome {
    public static void main(String[] args){
        String name="abcdcba";
        System.out.println(isPalindrome(name));
    }
    public static boolean isPalindrome(String name){
        if(name==null||name.length()==0){
            return true;
        }
        for(int i=0;i<name.length()/2;i++){
            int start=name.charAt(i);
            int end=name.charAt(name.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
