package Random;
import java.util.*;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){
            // space r-i
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            // star 2*i-1
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=r-1; i++){
            for(int j=0; j<i; j++){
           System.out.print(" ");
            }
            for(int k=2*(r-i)-1; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
