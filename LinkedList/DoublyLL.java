package LinkedList;

public class DoublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
        System.out.print(temp.val+" ");
        temp = temp.next;
    }
    System.out.println();
}
// print Reverse Node
public static void displayRev(Node tail){
    Node temp = tail;
    while(temp != null){
    System.out.print(temp.val+" ");
    temp = temp.prev;
    }
System.out.println();
}
// select Random Node and print all Node
public static void display2(Node random){
    Node temp = random;
    // move this temp backward to the head
    while(temp.prev != null){
        temp = temp.prev;
    }
    // print the list head
    while(temp != null){
        System.out.print(temp.val+" ");
        temp = temp.next;
    }
}
    // insert At head
    public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
    return head;
   }
    // insert At Tail
    public static void insertAtTail(Node head, int x){
        Node temp = head;
        Node t = new Node(x);
        while(temp.next.next !=null){
        temp = temp.next;
        }
       temp.next = t;
       t.prev = temp;
    }
    public static void insertAtAnyIndex(Node head,int idx, int x){
        Node temp = head;
        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        Node s = temp.next;
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
        t.next = s;
        s.prev = t;
    }
public static void main(String[] args) {
    Node a = new Node(4);
    Node b = new Node(10);
    Node c = new Node(2);
    Node d = new Node(99);
    Node e = new Node(13);
    a.prev = null;
    a.next = b;
    b.prev = a;
    b.next = c;
    c.prev = b;
    c.next = d;
    d.prev = c;
    d.next = e;
    e.prev = d;
    e.next = null;
    display(a); // 4 10 2 99 13
   // displayRev(e); // 13 99 2 10 4
    //display2(c); // 4 10 2 99 13
 //   Node newHead = insertAtHead(a,30);
   // display(newHead); // 30 4 10 2 99 13
  // insertAtTail(a,40);
   //display(a); // 4 10 2 99 40
   insertAtAnyIndex(a, 3, 55);
   display(a);
}
}