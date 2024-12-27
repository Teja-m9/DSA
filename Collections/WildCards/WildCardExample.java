package Collections.WildCards;
import java.util.*;

public class WildCardExample {
    public static void printList(List<?> list){
        for(Object obj:list){
            System.out.println(obj);
        }
    }
    public static void printNumbers(List<? extends Number> list){
        for(Number num:list){
            System.out.println(num);
        }
    }
    public static void addNumbers(List<? super Integer> list){
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
    public static void main(String[] args){
        List<String> stringList=Arrays.asList("Apple","Banana","Cherry");
        System.out.println("Unbounded wildcard Example:");
        printList(stringList);

        List<Integer> integerList=Arrays.asList(1,2,3);
        System.out.println("Upper-Bounded wildcard Example");
        printList(integerList);

        List<Number> numberList=new ArrayList<>();
        System.out.println("Lower-Bounded wildcard Example");
        addNumbers(numberList);
    }
}
