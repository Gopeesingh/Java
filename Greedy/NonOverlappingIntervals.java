package Greedy;
import java.util.*;
public class NonOverlappingIntervals {
    private static class Interval{
        int startTime;
        int endTime;
        public Interval(int startTime, int endTime){
            this.startTime = startTime;
            this.endTime = endTime;
        }
        public String toString(){
            return startTime + "-" + endTime;
        }
    }

    private static class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval i1, Interval i2){
            if(i1.startTime > i2.startTime) return 1;
            else if(i1.startTime < i2.startTime) return -1;
            else return 0;
        }
    }
    public static void main(String[] args) {
        List<Interval> intervalList = new ArrayList<>();
        intervalList.add(new Interval(1,2));
        intervalList.add(new Interval(2,3));
        intervalList.add(new Interval(3,4));
        intervalList.add(new Interval(1,3));

        intervalList.sort(new IntervalComparator());
        
        int result = 0;
        int previousEndTime = intervalList.get(0).endTime;
        for(int i=1; i<intervalList.size(); i++){
            Interval current = intervalList.get(i);
            // check if overlap then remove
            if(current.startTime < previousEndTime){
               // chhote vale ko previous bana do
               previousEndTime = Math.min(current.endTime,previousEndTime);
               result++;
            }
            else{
                previousEndTime = current.endTime;
            }
        }
        System.out.println(result); // 1
    }
}
