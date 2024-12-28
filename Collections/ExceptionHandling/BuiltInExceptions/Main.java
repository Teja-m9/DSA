package Collections.ExceptionHandling.BuiltInExceptions;
import java.util.*;
public class Main {
    public static void main(String[] args){
        int a=5;
        int b=0;
        int res=a/b;
        try{
            System.out.println(res);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
