package HashMaps;
import java.util.*;
public class LargestConsecutive {
    public int largestConsecutive(int []nums){
        HashSet<Integer> st = new HashSet<>();
        for(int num : nums) st.add(num);
        int maxStreak = 0;
        for(int num : st){
            if(!st.contains(num-1)){ // num is starting point sequnce
                int currNum = num; // 1
                int currStreak = 1; // length of current consecutive Sequence
                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }
}
