

//    1
//   121
//  12321
// 1234321

// import java.util.Scanner;
// public class NumericalPyramidPattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         for(int i=1; i<=r; i++) {
//             for(int j=1; j<=r-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=i; k++) {
//                 System.out.print(k);
//             }
//             for(int l=i-1; l>=1; l--) {
//                 System.out.print(l);
//             }
//             System.out.println();
//         }
//     }
// }


import java.util.Scanner;
public class NumericalPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++) {
            
            for(int j=1; j<=r-i; j++) {
                
                System.out.print(" ");
            }
            for(int k=i; k<=i; k++) {
                if(i==1 || i==i)
                System.out.print(k);
                else
                System.out.print(" ");
            }
            for(int l=i; l>=i; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}