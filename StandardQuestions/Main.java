package StandardQuestions;
import java.util.*;
public class Main {
    public static void main(String[] args){
        LRUCache lru=new LRUCache(5);
        lru.put(1,1);
        lru.put(2,2);
        lru.put(3,3);
        lru.put(4,4);
        lru.put(5,5);
        System.out.println(lru.get(1)); // Should return 1
        lru.put(6,6); // This should evict key 2
        System.out.println(lru.get(2)); // Should return -1 (not found)
        lru.put(7,7); // This should evict key 3
        System.out.println(lru.get(3)); // Should return -1 (not found)
        lru.put(8,8); // This should evict key 4
        System.out.println(lru.get(4)); // Should return -1 (not found)
        System.out.println(lru.get(5)); // Should return 5
        System.out.println(lru.get(6)); // Should return 6
    }
}
