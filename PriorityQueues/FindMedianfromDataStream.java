package PriorityQueues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedianfromDataStream {
//     public static void add(PriorityQueue<Integer> leftPq, PriorityQueue<Integer> rightPq, int element){
//         if(leftPq.isEmpty()){
//             leftPq.add(element);
//             return;
//         }
    
//         // agar left me janna hai
//         if(element<leftPq.peek()){
//             if(rightPq.size() == leftPq.size()){
//                 leftPq.add(element);
//             } else{
//                 rightPq.add(leftPq.remove());
//             leftPq.add(element);
//             }
//         }
//         // agar right me jana ho
//         else{
//             if(rightPq.size() == leftPq.size()){
//                 leftPq.add(rightPq.remove());
//                 rightPq.add(element);
//             }else{
//                 rightPq.add(element);
//             }
//         }
//     }
//     public static int findMedian(PriorityQueue<Integer> leftPq, PriorityQueue<Integer> rightPq){
//         if(rightPq.isEmpty() || leftPq.isEmpty()) return -1;
//         else if(leftPq.size() - rightPq.size() == 1)
//         return leftPq.peek();
//         else{
//         return (double)(leftPq.peek() + rightPq.peek())/2;
//         }
//     } 
//     public static void main(String[] args) {
// PriorityQueue<Integer> leftPq = new PriorityQueue<>(Comparator.reverseOrder());
// PriorityQueue<Integer> rightPq = new PriorityQueue<>();
//     }
}
