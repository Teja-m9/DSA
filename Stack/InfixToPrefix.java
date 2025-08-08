import java.util.*;
public class InfixToPrefix {
    public static void main(String[] args){
        String s="(p+q)*(c-d)";
        StringBuilder sb=new StringBuilder(s).reverse();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='('){
                sb.setCharAt(i,')');
            }
            else if(sb.charAt(i)==')'){
                sb.setCharAt(i,'(');
            }
        }
        String postfix=InfixToPostfix(sb.toString());
        String prefix=new StringBuilder(postfix).reverse().toString();
        System.out.println("Prefix expression: " + prefix);
    }
    public static String InfixToPostfix(String s){
        StringBuilder res=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                res.append(ch);
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res.append(st.pop());
                }
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                while(!st.isEmpty() && prec(ch)<=prec(st.peek())){
                    if(ch=='^' && st.peek()=='^') {
                        break;
                    }
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();
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
