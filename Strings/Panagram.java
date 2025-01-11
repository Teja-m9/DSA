package Strings;

public class Panagram {
    public static void main(String[] args){
        String s1="thequickbrownfoxjumpsoverthelazydog";
        String s2="thequickbrownfoxjumpsoverthelazydog";
        if(s1.length()!=s2.length()){
            System.out.println("False");
            return;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
