package Collections.Generics;
import java.util.*;

public class    Box<T>{
    private T value;
    public Box(T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value=value;
    }
    @Override
    public String toString(){
        return "Box {" + "Vlaue="+'}';
    }
public class GenericsExample{

    public static <T> void printBox(Box<T> box){
        System.out.println(box);
    }
    public static void main(String[] args){
        Box<Integer> intBox=new Box<>(42);
        System.out.println("Integer Box:");
        printBox(intBox);
        
        
    }
}
}