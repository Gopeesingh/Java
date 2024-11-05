package LinkedList;

public class ReversList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node reverse(Node head){
        if(head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head; // interchangin the connection
        head.next = null;
        return newHead;
        //4 -> 2 -> 1 -> 5 -> 3
    }
    public static void display(Node head){
        if(head == null) {// base case
        System.out.println();
        return;
        }
        System.out.print(head.val+" "); // work
        display(head.next); // call
        // 3 -> 5 -> 1 -> 2 -> 4
    }
    public static void displayrev(Node head){
        if(head == null) return; // base case
        displayrev(head.next); // call
        System.out.print(head.val+" "); // work
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
     //   displayrev(a); //4 -> 2 -> 1 -> 5 -> 3
     display(a); // 3 -> 5 -> 1 -> 2 -> 4
    a= reverse(a);
    display(a); //4 -> 2 -> 1 -> 5 -> 3
    }
}
