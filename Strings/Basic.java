package Strings;

public class Basic {
    public static void main(String[] args){
        String name="Teja";
        System.out.println(name);
        //In this the refernce variable name is stored in the stack memoery and the value "Teja" is stored in the heap memeory and the refernece variable is poitnig towards the value "Teja"
        name="Siva";
        //After changing the value a new value "Siva" is created in the heap memory
        //After this assignment the refernce varibale name is pointing towards the value "Siva" and the value "Teja" is still in the heap memory and it is not deleted 
        System.out.println(name);
    }
}
