import java.lang.*;
import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}
public class removeN19 {
    public static void main(String[] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        int n=2;
        Solution sol=new Solution();
        head=sol.removeN(head,n);
        sol.printList(head);
    }
}
class Solution{
    public ListNode removeN(ListNode head,int n){
        int len=getLength(head);
        if(n==len){
            return head.next;
        }
        ListNode prev=get(head,len-n-1);
        prev.next=prev.next.next;
        return head;
    }
    public int getLength(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode get(ListNode head,int index){
        ListNode temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void printList(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
