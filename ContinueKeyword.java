
// import java.util.Scanner;
// public class ContinueKeyword {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//         for(int num=1; num<=50; num++) {
//             if(num%3==0) {
//                 continue;
//             }
//         System.out.println(num);
//         }

//     }
// }

// Question:-  print all the value between 1 to 50 except for the multiple of 3

// import java.util.Scanner;
// public class ContinueKeyword {
//     public static void main(String[] args) {
//         int num = 1;
//         while(num<=50) {
//             if(num%3==0) {
//                 num++;
//                 continue;
//             }
//             System.out.println(num);
//             num++;
//         }
//     }
// }
import java.util.Scanner;
public class ContinueKeyword {
    public static void main(String[] args) {
        myloop: for(int num=1; num<=50; num++) {
            if(num%3==0) {
                continue myloop;
            }
            System.out.println(num);
        }
    }
}
