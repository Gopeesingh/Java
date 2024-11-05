package DSA;
public class reverse {
  public static void main(String[] args) {
    int num  = 151;
    int n = num;
    int reversenum = 0;
    while(num > 0){
      int digit = num % 10;
      reversenum = reversenum * 10 + digit;
      num  = num/10;
    }
    System.out.println(reversenum);
    if(reversenum == n){
      System.out.println("Palindrome");
    }
    else {
      System.out.println("not palindrome");
    }
  }
}
