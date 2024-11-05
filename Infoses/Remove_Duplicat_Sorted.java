package Infoses;
import java.util.*;
public class Remove_Duplicat_Sorted {

    public static int[] removeDuplicate(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        
        // Populate the map with unique elements
        for (int i = 0; i < arr.length; i++) {
            if (!mp.containsKey(arr[i])) {
                mp.put(arr[i], 1);
            }
        }
        
        // Create an array to store the unique elements
        int[] res = new int[mp.size()];
        int i = 0;
        
        // Fill the result array with the unique keys from the map
        for (int key : mp.keySet()) {
            res[i++] = key;
        }
        
        return res; // Return the array of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 5, 6};
        Remove_Duplicat_Sorted a = new Remove_Duplicat_Sorted();
        
        // Call the method to remove duplicates
        int[] ans = a.removeDuplicate(arr);
        
        // Print the resulting array using Arrays.toString()
        System.out.println(Arrays.toString(ans)); // [1, 2, 3, 4, 5, 6]
    }
}
