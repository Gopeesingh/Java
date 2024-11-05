package LinkedList;

public class PalindromeInDLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val =  val;
        }
    }
    public static boolean isPalindrome(Node head){
        Node temp = head;
        Node l = head;
        while(temp.next != null) {
        temp = temp.next;
        }
        Node r = temp;
       temp = l;
       while(r != l){
      if(l.val != r.val) return false;
      l = l.next;
      r = r.prev;
       }
      return true;
       
}
public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(3);
    Node e = new Node(2);
    Node f = new Node(1);
    a.prev = null;
    a.next = b;
    b.prev = a;
    b.next = c;
    c.prev = b;
    c.next = d;
    d.prev = c;
    d.next = e;
    e.prev = d;
    e.next = f;
    f.prev = e;
    f.next = null;
    System.out.println(isPalindrome(a)); // 
}
}