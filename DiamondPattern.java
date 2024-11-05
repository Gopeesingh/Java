
//     A
//    ABC
//   ABCDE
//  ABCDEFG
// ABCDEFGHI
//  ABCDEFG
//   ABCDE
//    ABC
//     A                         //DIAMOND PATTERN

import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        int num = 0;      // will increment alpha as char progresses
        int alpha = 65;  //ASCII code for first capital latter
        
        for(int i=1; i<=r; i++) {
            // space print r-i
            for(int j=1; j<=r-i; j++) {
                System.out.print(" ");  // top half 
            }
            for(int k=1; k<=2*i-1; k++) {
                System.out.print((char) (alpha+num++));
            }
            num=0;
            System.out.println();
        }
        for(int i=1; i<=r-1; i++) {
            for(int j=0; j<i; j++) {  //bottom half
                System.out.print(" ");
            }
            for(int k=(r-i)*2-1; k>0; k--) {
                System.out.print((char) (alpha+num++));
            }
            num=0;
            System.out.println();
        }
    }
}
