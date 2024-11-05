package DSA;
import java.util.*;
public class RomanToInt {
        public int romanToInt(String s) {
    Map<Character, Integer> m = new HashMap<>();
    
    m.put('I', 1);
    m.put('V', 5);
    m.put('X', 10);
    m.put('L', 50);
    m.put('C', 100);
    m.put('D', 500);
    m.put('M', 1000);
    
    int ans = 0;
    // what is mean of this line if XLI -> s.charAt(1) -> L 
    for (int i = 0; i < s.length(); i++) { // terverse on s
        if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) { // when input XLI then X<L so m.get(s.charAt(i)) < m.get(s.charAt(i + 1)
            ans -= m.get(s.charAt(i)); // ans = 0 - 10 -> ans = -10 then check m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) then we will go else statement
        } else {
            ans += m.get(s.charAt(i)); // ans = -10 + 50 = 40 -> ans = 40 + 1 = 41 -> ans = 41
        } 
    }

    return ans; 
    }
    public static void main(String[] args) {
        String s = "XLVII";
        RomanToInt ri = new RomanToInt();
        ri.romanToInt(s);
        System.out.println(ri.romanToInt(s));
    }
}
