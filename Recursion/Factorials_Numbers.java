package Recursion;

import java.util.Scanner;
public class  Factorials_Numbers{
public static int fact(int n){
    // base case 
    if(n == 0) return 1;
    // work
    return fact(n-1) * n;
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
    fact(n);
}
}
