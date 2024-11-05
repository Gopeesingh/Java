import java.util.*;
public class StringsBuildar {
    public static void main(String[] args) {
          StringBuilder str = new StringBuilder("Gopee"); // Gopee
       //  str.append(" Singh"); //Singh
       //  System.out.println(str); // Gopee Singh

        // setCharAt & append(ch)
        // why we use setCharAt() bcoz we want to change H place with D
   // str.setCharAt(0,'B');
    // System.out.println(str); // Bopee
    // str.append(" Singh");
    // System.out.println(str); // Bopee singh

    // insert(idx,ch) and deletecharAt(idx)
// str.insert(2,'y'); // insert
// System.out.println(str); // Goypee
// str.deleteCharAt(0); //delete
// System.out.println(str); // oypee

// Revers() and delete(i,j)
System.out.println(str); // Gopee
str.reverse();  // reverse
System.out.println(str); // eepoG
str.delete(2, 4); // delete
System.out.println(str); // eeG
    }
}
