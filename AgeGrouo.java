
// if-else if statement

import java.util.Scanner;
public class AgeGrouo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age <= 12) {
            System.out.println("child");
        }
    else if(age>12 && age<18) {
        System.out.println("teenager");

    }
    else if(age>18) {
        System.out.println("adult");
    }
    
}


}
