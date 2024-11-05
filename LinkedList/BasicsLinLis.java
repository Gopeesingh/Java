package LinkedList;
import java.util.*;
public class BasicsLinLis {
    public static class Node {
        int data; // value
        Node next; // address of next node
        // constructor
        Node(int data) {
        this.data = data;
        }
    }   
        public static void main(String[] args) {
        Node a = new Node(5); // head node
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 9 8 16
        a.next = b; // 5 -> 3  9  8  16
        b.next = c; // 5 -> 3 -> 9  8  16
        c.next = d; // 5 -> 3 -> 9 -> 8  16
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        // or for print simple to minimize speace

        Node temp = a;
        // for(int i=1; i<=5; i++) {
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }
// or for print simple to minimize speace

while(temp != null) {
    System.out.print(temp.data+" ");
    temp = temp.next;
}
    }
}
