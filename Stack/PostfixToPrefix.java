import java.util.*;
public class PostfixToPrefix {
    public static void main(String[] args){
        String s="ABC/-AK/L-*";
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String s1=st.pop();
                String s2=st.pop();
                String temp=ch+s2+s1;
                st.push(temp);
            }
        }
        System.out.print(st.pop());
    }
}
