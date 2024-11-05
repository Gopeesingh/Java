package HashMaps;
import java.util.*;
public class HashmapsMethod {
    static void HashMapMethods(){
        // Syntax
        Map<String, Integer> mp = new HashMap <>();
        // Adding Element
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        // Getting value of a key from hashmap
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); // null
        
        // Changing/updating value of key in the Hashmap
        mp.put("Akash", 25); // Akash -> 25
        System.out.println(mp.get("Akash")); // 25
        
        // Removing a pair from hashmap
        System.out.println(mp.remove("Akash")); // 25
        System.out.println(mp.remove("Riya")); // null
        // Checking if a key is in a hashmap
       System.out.println(mp.containsKey("Akash")); // false
       System.out.println(mp.containsKey("Yash")); // true

        // Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika", 30); // wil enter
        mp.putIfAbsent("Yash", 30); // will not enter
        // Get all key in the hashmap
        System.out.println(mp.keySet()); //[Lav, Rishika, Yash, Harry, Yashika]
        // Get all values in the Hashmap
        System.out.println(mp.values()); //[17, 19, 16, 18, 30]
        // Get all entries int the hashmap
        System.out.println(mp.entrySet()); // [Lav=17, Rishika=19, Yash=16, Harry=18, Yashika=30]
        // Traversing all entries of Hashmap - multiple methods
    for(String key : mp.keySet()){
        System.out.printf("age of %s is %d\n", key, mp.get(key));
    }
    System.out.println();
    for(Map.Entry<String, Integer> e : mp.entrySet()){
        System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
    }

            }
       public static void main(String[] args) {
        HashMapMethods();
       }
    }