
import java.util.Scanner;
public class BreakKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int num=1; num<=10; num++)  {
            if(num==5)  {
                break;
            }
            System.out.println(num);
        }
    }
}
