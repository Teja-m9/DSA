package Strings;

public class Comparison {
    public static void main(String[] args){
        String a="Teja";
        String b="Teja";
        System.out.println(a==b);
        //In this the == operator can check if both the refernce variables are pointing towards the same value or not 

        String c=new String("Teja");//This is a way of creating a String Object in Java
        String d=new String("Teja");
        System.out.println(c.equals(d));
        //In this the equals() method is only checking the values of reference variables and not the refernce variables
    }
}
