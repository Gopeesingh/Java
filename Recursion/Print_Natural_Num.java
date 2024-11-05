package Recursion;
import java.util.*;
public class Print_Natural_Num {
    // public static void naturalNumber(int n){
    //     if(n == 1){
    //          System.out.println(n);
    //         return;
    //     }
    //     naturalNumber(n-1);
    //     System.out.println(n);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     naturalNumber(n);
    // }

   // for revers this code

   public static void naturalNumber(int n){
    if(n == 1){
         System.out.println(n);
        return;
    }
    System.out.println(n);
    naturalNumber(n-1);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    naturalNumber(n);
}
}
