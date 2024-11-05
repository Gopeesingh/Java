package PriorityQueues;
import java.util.*;
public class SumoftwoIntK1andK2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int k1 = 3;
        int k2 = 6;
        arr.add(20);
        arr.add(8);
        arr.add(22);
        arr.add(4);
        arr.add(12);
        arr.add(10);
        arr.add(14);
        // brute
        Collections.sort(arr);
        int sum = 0;
        for(int i = k1; i< k2-1; i++){
            sum += arr.get(i);
        }
        System.out.println(sum); // 26

        // optimal Solution
 PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // O(NlogN)
for(int i=0; i < arr.size(); i++){
    pq.add(arr.get(i));

    if(pq.size() >  k2){ // O(N-K2 logn) 
        pq.remove(); // remove 22 -> {4, 8, 10, 12, 14, 20, 22} -> {4, 8, 10, 12, 14, 20}
    }
} 
// smallest k2th element
pq.remove(); //  remove exact k2 20-> {4, 8, 10, 12, 14} 
// remove k2 th element

sum = 0;
while(pq.size() != k1){ // O(k2 - k1)log k2
    sum += pq.remove(); //from {4, 8, 10, 12, 14} remove {4, 8, 10} -> {12, 14} and its sum 26
}
// O()
System.out.println(sum);
    }
}
