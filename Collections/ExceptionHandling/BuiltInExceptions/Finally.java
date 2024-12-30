package Collections.ExceptionHandling.BuiltInExceptions;

public class Finally {
    public static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please don not divide by zero");
        }
        return a/b;
    }
    public static void main(String[] args){
        int a=10;
        int b=0;
        try{
            divide(a,b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("YOU Successfully completed the try-catch-finally exception blocks");
        }
    }
}
