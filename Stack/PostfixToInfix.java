import java.util.*;
public class PostfixToInfix {
    public static void main(String[] args){
        String s="ab*c+";
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else if(isOperator(ch)){
                String s1=st.pop();
                String s2=st.pop();
                String temp="("+s1+ch+s2+")";
                st.push(temp);
            }
        }
        System.out.println("Infix expression: " + st.pop());
    }
    public static boolean isOperator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^';
    }
    
}
