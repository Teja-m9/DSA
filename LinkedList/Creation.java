public class Creation {
    private Node head;
    private Node tail;
    private int size;
    public Creation() {
        this.head = null;
        this.tail = null;
        this.size = 0;
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
