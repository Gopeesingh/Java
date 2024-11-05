package LinkedList.Queue;
import java.util.*;
public class ReverseFirstK {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
  System.out.println(q);  // [1,2,3,4,5]
  Stack<Integer> st = new Stack<>();
  for(int i=1; i<=q.size()-2; i++){
    q.add(q.remove());
  }
System.out.println(q); // [5,4,1,2,3]
    }
}
