import java.util.*;
public class PrefixToInfix {
    public static void main(String[] args){
        String s="*+pq-cd";
        Stack<String> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String s1=st.pop();
                String s2=st.pop();
                String temp="("+s1+ch+s2+")";
                st.push(temp);
            }
        }
        System.out.println("Infix expression: " + st.pop());
    }
}
