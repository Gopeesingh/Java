package LinkedList;
// question is Finding 3rd Node from last
public class NthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static Node nthNode(Node head, int n) {
int size = 0;
Node temp = head;
while(temp != null) {
    size++;
    temp = temp.next;
}
int m = size-n+1;
// m Node from start
temp = head;
for(int i=1; i<=m-1; i++){
    temp = temp.next;
}
return temp;
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
    Node q = nthNode(a, 3);
    System.out.println(q.data); // 5
    }
}
