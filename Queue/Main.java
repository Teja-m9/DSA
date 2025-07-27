package Queue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Queue after adding elements: " + queue);
        System.out.println("Front element: " + queue.peek());
        queue.poll();
        System.out.println("Queue after removing an element: " + queue);
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Size of queue: " + queue.size());
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}
