import java.util.Scanner;
public class IncreasingNaturalnNum {
    static void printIncreasing(int n) {
        // base case
        if(n==1) {
            System.out.println(1);
            return;
        }
        // self work
        printIncreasing(n-1);  // 1,2,3,4,5......n-1
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
