package PriorityQueues;
import java.util.*;
public class Insert_In_MinHeap {
    public static void push_in_minHeap(List<Integer> heap, int i){
    int parent_index = (i - 1)/2;
    if(heap.get(parent_index) < heap.get(i)) return;
    
        swap(heap, i, parent_index);
        push_in_minHeap(heap, parent_index);
    }
    public static void insert_in_MinHeap(List<Integer> heap , int element){
    heap.add(element);
    int index = heap.size()-1;
    push_in_minHeap(heap, index);
    }
    public static void swap(List<Integer> heap, int i, int j){
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }
        public static void main(String[] args) {
            List<Integer> heap = new ArrayList<>();
            heap.add(10);
            heap.add(20);
            heap.add(30);
            heap.add(40);
            heap.add(50);
            System.out.println(heap);
            insert_in_MinHeap(heap, 5);
            System.out.println(heap);
        }
}
