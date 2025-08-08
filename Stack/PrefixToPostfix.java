import java.util.*;
public class PrefixToPostfix {
    public static void main(String[] args){
    String s="*-A/BC-/AKL";
    Stack<String> st=new Stack<>();
    for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            st.push(String.valueOf(ch));
        }
        else{
            String s1=st.pop();
            String s2=st.pop();
            String temp=s1+s2+ch;
            st.push(temp);
        }
    }
    System.out.println(st.pop());
}
}
