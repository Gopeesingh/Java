import java.util.*;
public class StringSubString {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         // substring(i,j) substring(i)
        // String str = "abcde";
        // System.out.println(str.substring(2,3)); // c
        // System.out.println(str.substring(2,4)); // cd
        // System.out.println(str.substring(3)); //de
        // System.out.println(str.substring(0)); //abcde

        // Question:- what will be the output of following code ?
        String s = "physics";
        for(int j=2; j<4; j++) {
            System.out.print(s.substring(j));
        } 
    }
}
