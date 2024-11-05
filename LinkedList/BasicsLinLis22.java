package LinkedList;

public class BasicsLinLis22 {
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static int length(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
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
     //   display(a);
     System.out.println(length(a));
}
}

// public static void displayr(Node head) {
//     if(head == null) return;
//         Node temp = head;
//             System.out.print(head.data+" ");
//             displayr(head.next);
//         }
//     public static class Node {
//         int data; // value
//         Node next; // address of next node
//         // constructor
//         Node(int data) {
//         this.data = data;
//         }
//     }
//     public static void main(String[] args) {
//         Node a = new Node(5); // head node
//         Node b = new Node(3);
//         Node c = new Node(9);
//         Node d = new Node(8);
//         Node e = new Node(16);
//         // 5 3 9 8 16
//         a.next = b; // 5 -> 3  9  8  16
//         b.next = c; // 5 -> 3 -> 9  8  16
//         c.next = d; // 5 -> 3 -> 9 -> 8  16
//         d.next = e; // 5 -> 3 -> 9 -> 8 -> 16
//         displayr(a);
// }
// }