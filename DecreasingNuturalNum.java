import java.util.Scanner;
public class DecreasingNuturalNum {
    static void printDecreasing(int n) {
        // base case
        if(n==1) {
            System.out.println(1);
            return;
        }
        // self work
        System.out.println(n);
        // recursive work
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
}
