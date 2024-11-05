package HashMaps;
import java.util.*;
public class LargestSubarray0Sum {
    int maxLen(int arr[], int n) {
    HashMap<Integer,Integer> mp = new HashMap<>();
    // prefixsum , index
    int maxlen = 0, prefsum = 0;
    mp.put(0,-1);
    for(int i=0; i<arr.length; i++){
        prefsum += arr[i];
        if(mp.containsKey(prefsum)){
            maxlen = Math.max(maxlen, i - mp.get(prefsum));
        }else{
            mp.put(prefsum,i);
        }
    }
    return maxlen;
}
}

