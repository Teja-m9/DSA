package Collections.ComparingObjects;

import java.util.*;

public class Main1{
    public static void main(String[] args){
        List<Person> people=new ArrayList<>();
        people.add(new Person("Teja",10));
        people.add(new Person("Chakri",12));

        Collections.sort(people);
        for(Person i:people){
            System.out.print(i);
        }
    }
}
