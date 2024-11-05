package LinkedList;

public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
         }
}
    public static Object size;
    public static class linkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        // for insertAtEnd any node
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        // for insertAtHead any Node
        void insertAtHead(int val){
            Node temp = new Node(val);
                if(head==null){ // empty list
                    head = tail = temp;
                }
                else{ // non empty list
                    temp.next = head;
                    head = temp;
                }
                size++;
        }
        // for insertAt
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size) { // for search your tail and head element
                insertAtEnd(val);
                return;
            }
            else if(idx == 0){ // for insert any node at place 0
                insertAtHead(val);
                return;
            }
            for(int i=1; i<=idx-1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getAt(int idx) { // if call index then print that node
            if(idx<0 || idx>size) {
                System.out.println("wrnog idex");
                return -1;
            }
            Node temp = head;
            for(int i=1; i<=idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        // for delete ant Node
        void deleteAt(int idx) {
            if(idx == 0){
            head = head.next;
            size--;
            return;
            }
            Node temp = head;
            for(int i=1; i<idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        // for display in ll class
        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        // for size or length
    //     int size() {
    //         Node temp = head;
    //         int count = 0;
    //         while(temp != null) {
    //             count++;
    //             temp = temp.next;
    //         }
    //         return count;
    //     }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
    ll.insertAtEnd(4); // 4
 //   ll.display();
    ll.insertAtEnd(5); // 4 -> 5
   // ll.display();
    ll.insertAtEnd(6); // 4 -> 5 -> 6
   // ll.display();
    ll.insertAtHead(8); // 8 -> 4 -> 5 -> 6
   // ll.display();
    ll.insertAt(3, 10); // 8 -> 4 -> 5 -> 10 -> 6
   ll.display();
ll.insertAt(0, 100); // 100 -> 8 -> 4 -> 5 -> 10 -> 6
ll.display();
 //   System.out.println(ll.tail.data); // (6)  for know what is tail in linkedlist
 //   System.out.println(ll.getAt(4)); // (10) getAt index to know node
    // System.out.println();
    // System.out.println(ll.size);
    ll.deleteAt(0); // delete node by deleteAt() -> 100 8 4 5 10 
    ll.display();
    System.out.println(ll.tail.data);// for know what is tail in linkedlist ->10
//    System.out.println(ll.head.data);
    }
}
