package Random;

public class ReverseStrings2 {
    public static String reverseStr(String str, int idx){
        // base case
        if(idx == str.length()) return"";
        // work
    String smallans = reverseStr(str, idx + 1);
    return smallans + str.charAt(idx);
        }
        public static void main(String[] args) {
            ReverseStrings2 f = new ReverseStrings2();
            String str = "Gopee";
            String pal = f.reverseStr(str, 0);
            System.out.println("Reverse string: " +pal); //eepoG
        }
}
