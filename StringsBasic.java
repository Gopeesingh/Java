import java.util.*;
public class StringsBasic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String str = "hello";
      //  System.out.println(str); // Hello

      // Taking Input - next() nextLine()
     // String s = sc.nextLine();
     // System.out.println(s); // Gopee singh

     //Length()
    //  String str = "Gopee";
    //  int len = str.length();
    //  System.out.println(len); // 5

     // charAt()
    //  String str = "Dhairya";
    //  System.out.println(str.charAt(3)); // i
    // or
    // String str = "Dhairya";
    // char ch = str.charAt(4);
    // System.out.println(ch); // r

    // indexOf()
    // String str = "gopeesingh";
    // int idx = str.indexOf('n');
    // System.out.println(idx); // 7

    // Compare To()
    // String str = "Hello";
    // String gtr = "Dello";
    // System.out.println(str.compareTo(gtr)); // 4

    // Contains()
    // String str = "Physics Wallah";
    // System.out.println(str.contains("Wall")); // true
    // System.out.println(str.contains("zad")); // false

    // StartsWith() & endsWith()
    // String str = "Gopee singh";
    // System.out.println(str.startsWith("Gopee")); // true
    // System.out.println(str.endsWith("ingh")); //true

    // toLowerCase(), toUpperCase()
    String str = "Gopee singh";
    System.out.println(str.toLowerCase()); // gopee singh
    System.out.println(str.toUpperCase()); // GOPEE SINGH

    // concat();
    String s1 = "abc";
    String s2 = "def";
    System.out.println(s1.concat(s2));
    }
    }
