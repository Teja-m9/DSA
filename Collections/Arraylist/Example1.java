package Collections.Arraylist;

import java.util.*;

public class Example1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        // Taking 5 integer inputs
        System.out.println("Enter 5 integers: ");
        for(int i = 0; i < 5; i++) {
            if(sc.hasNextInt()) {
                list.add(sc.nextInt());
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // consume the invalid input
            }
        }

        // Printing the elements of the ArrayList
        System.out.println("Elements in the list are: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");  // Add a space for readability
        }

        sc.close();  // Always close the scanner when done
    }
}
