import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int SumOfDigits=0;
        int Original_n = n;
        while(n>0) {
            SumOfDigits+=n%10;
            n=n/10;
        }
        System.out.println("number of digits in" +Original_n+ "=" + SumOfDigits);
    }
}
