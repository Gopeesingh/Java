package Infoses;
import java.util.*;
class  print_n_number {
    public static void printNumber(int currNum, int n){
        // base case
        if(currNum > n){
            return;
        }
            System.out.println(currNum);
            printNumber(currNum+1, n);
    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    System.out.println("Enter n number of element");
    int n = sc.nextInt();
    printNumber(1,n);
    }
}