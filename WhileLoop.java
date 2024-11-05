
//import java.util.Scanner;
//public class WhileLoop  {
  //  public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
      //  int n = sc.nextInt();
        //int num = 1;
       // while(num<=n) {
         //   System.out.println(num);
   //    num++;  //increment opertors ++, num = num+1
     //   }
   // }
//}

import java.util.Scanner;
public class WhileLoop  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int num = 1;
        int sum = 0;
        while(num<=n) {
            System.out.println(num);
            sum=sum+num;
    num ++;  //increment opertors ++, sum = sum+num
        }
    System.out.println(sum);       

    }
}