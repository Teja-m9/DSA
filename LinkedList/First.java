public class First {
    private Node head;
    private Node tail;
    private int size;
    public First() {
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
        public Node(int value) {
            this.value = value;
        }
    }
    public void insetFirst(int value){
        Node node=new Node(value);
        if(tail==null){
            head=node;
            tail=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        First list = new First();
        list.insetFirst(3);
        list.insetFirst(2);
        list.insetFirst(1);
        list.display();
    }
}
