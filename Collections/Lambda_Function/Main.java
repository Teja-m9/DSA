package Collections.Lambda_Function;
import java.util.*;
public class Main {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
        arr.forEach((item)->{
            System.out.println(item*2);
        });
    }
}
