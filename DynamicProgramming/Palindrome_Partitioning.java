package DynamicProgramming;
import java.util.List;
import java.util.ArrayList;


public class Palindrome_Partitioning {

 static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l <= r){
            if(s.charAt(l++) != s.charAt(r--))
            return false;
        }
        return true;
    }
    static void rec(int idx, String s, List<List<String>> result, List<String> ans){
        // base condition
        if(idx == s.length()){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i = idx; i<s.length(); i++){
            String temp = s.substring(idx, i+1);
        if(isPalindrome(temp)){
            ans.add(temp);
            rec(i+1, s, result, ans);
            ans.remove(ans.size() - 1);
        }
        }
    }
    public static void main(String[] args) {
        String s = "aababa";
        List<List<String>> result = new ArrayList<>();
        List<String> ans = new ArrayList<>();

        int idx = 0;
        rec(idx, s, result, ans);
        System.out.println(result);
// [[a, a, b, a, b, a], [a, a, b, aba], [a, a, bab, a], [a, aba, b, a], [a, ababa], [aa, b, a, b, a], [aa, b, aba], [aa, bab, a]]
    }
}
