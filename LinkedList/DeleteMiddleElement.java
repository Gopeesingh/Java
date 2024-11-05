package LinkedList;

public class DeleteMiddleElement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node deleteMiddleElement(Node head) {
        if(head.next == null){
            return null;
        }
        Node fast = head;
        Node slow = head;
    while(fast.next.next.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    slow.next = slow.next.next;
    return head;
    
    }
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
    // 100 13 4 5 12 10
display(a);
 a = deleteMiddleElement(a); // 100 13 4 12 10
display(a);
    }
}

