public class Creation {
    private Node head;
    private Node tail;
    private int size;
    public Creation() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==head){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
