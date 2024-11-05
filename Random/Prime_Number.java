package Random;

import java.util.Scanner;

public class Prime_Number {
    public static boolean isprimeNumber(int nums){
        if(nums <= 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(nums); i++){
            if(nums%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // int nums = 4;
        // Prime_Number p = new Prime_Number();
        // System.out.println(p.isprimeNumber(nums));

        // by user taking input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int nums = sc.nextInt();
        if(isprimeNumber(nums)){
            System.out.println(nums + " is prime number");
        }
        else{
            System.out.println(nums + " is not prime number");
        }
        
    }
}
