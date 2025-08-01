package StandardQuestions;
import java.util.*;
public class LRUCache {
    private int capacity;
    Node head=new Node(0,0),tail=new Node(0,0);
    private Map<Integer,Node> map=new HashMap<>();
    public LRUCache(int capacity){
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    public int get(int key){
        if(map.containsKey(key)){
            Node data=map.get(key);
            remove(data);
            insert(data);
            return data.value;
        }
        return -1;
    }
    public void put(int key,int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(capacity==map.size()){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    public void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insert(Node node){
        map.put(node.key,node);
        Node temp=head.next;
        head.next=node;
        node.prev=head; 
        node.next=temp;
        temp.prev=node;
    }
}
class Node{
    int key,value;
    Node prev,next;
    public Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}