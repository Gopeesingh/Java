
//    *
//   ***
//  *****
// *******
import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){    //trevessing over row
            // print r-i space
            for(int j=1; j<=r-i; j++) {
                System.out.print(" ");
            }
            //print 2*i-1 star
            for(int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
