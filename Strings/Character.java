package Strings;

public class Character {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder();//Initially stored the capacity of 16 characters
        for(int i=0;i<26;i++){
            char res=(char)('a'+i);
            sb.append(res);
        }
        System.out.println(sb);
    }
}
