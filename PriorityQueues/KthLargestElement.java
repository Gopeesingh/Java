package PriorityQueues;
import java.util.*;
public class KthLargestElement {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int k = 3;
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.add(4);

        arr.sort(Comparator.reverseOrder());
        System.out.println(arr.get(k - 1));
    }
}
