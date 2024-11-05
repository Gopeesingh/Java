package DSA;

import java.util.Scanner;

public class Dec_To_Bin {
    public static int dec(int nums){
        int ans = 0;  //converted decimal number
        int pw = 1;  //2^0=1 power of 2
    
        while(nums > 0){
            int parity = nums % 2;
            ans += (parity * pw);
            nums /= 2;
            pw *= 10;
        }
        return ans;
       
    }

    public static void main(String[] args) {
        int nums = 3;
        Dec_To_Bin b  = new Dec_To_Bin();
        System.out.println(b.dec(nums));



    //     Scanner sc = new Scanner(System.in);
    // int decimal_num = sc.nextInt();
    // int ans = 0;  //converted decimal number
    // int pw = 1;  //2^0=1 power of 2

    // while(decimal_num > 0){
    //     int parity = decimal_num % 2;
    //     ans += (parity * pw);
    //     decimal_num /= 2;
    //     pw *= 10;
    // }
    // System.out.println(ans);
    }
}
