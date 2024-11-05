import java.util.Scanner;
public class Palindrome {
    static String palindrome(String s, int idx) {
        if (idx == s.length()) return "";  // Return an empty string in the base case
        String smallAns = palindrome(s, idx + 1);
        return smallAns + s.charAt(idx);
    }

    public static void main(String[] args) {
        String s = "aba";
        Palindrome c = new Palindrome();
        String pal = c.palindrome(s, 0);
        System.out.println("Reversed String: " + pal);

        // Use .equals() for string comparison
        if (pal.equals(s)) {
            System.out.printf("%s is a palindrome", s);
        } else {
            System.out.printf("%s is not a palindrome", s);
        }
    }
}



// import java.util.Scanner;
// public class Palindrome{
//     static boolean isPalindrome(String s, int l, int r) {
//         if(l>=r) return true;
//         return s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1);
//     }
//         public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//     String s = sc.nextLine();
//     System.out.println(isPalindrome(s, 0, 0));
// }
// }