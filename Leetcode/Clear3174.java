package Leetcode;
public class Clear3174 {
    public static void main(String[] args){
        String s="abc";
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
