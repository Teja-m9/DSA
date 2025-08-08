import java.util.*;
public class InfixToPostfix {
    public static void main(String[] args){
        String s="a+b*(c^d-e)^(f+g*h)-";
        String res="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                res+=ch;
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res+=st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && prec(ch)<=prec(st.peek())){
                    res+=st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        System.out.println("Postfix expression: " + res);
    }
    public static int prec(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
