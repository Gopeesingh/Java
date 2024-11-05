//Immutability of String (Intering new latter)

import java.util.*;
public class StringImmutability {
    public static void main(String[] args) {
        String s = "Hello";
    s = s.substring(0,2) + "y" + s.substring(2);
    System.out.println(s); // Heyllo

    // str.equals() and ==
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    System.out.println(s1==s2); // True -> Same address
    System.out.println(s1==s3); // False -> diff address

    System.out.println(s1.equals(s3));
    }
}
