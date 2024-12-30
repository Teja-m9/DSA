package Collections.ExceptionHandling.BuiltInExceptions;
import java.io.*;
public class Throw {
    public static void checkAge(int age){
            if(age<18){
                throw new IllegalArgumentException("age is not valid");
    
            }
            else{
                System.out.println("age is valid");
            }
        }
        public static void main(String[] args){
            try{
                checkAge(21);
        }
            catch(IllegalArgumentException e){
                System.out.println("Caught Exception "+e.getMessage());
        }
        
    }
}
