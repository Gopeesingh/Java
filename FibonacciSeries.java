
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= 1; //intial 2 element are 1 and 1 
        int b= 1;
        for(int i=1; i<=n; i++)  {
            System.out.print(a+ " ");
            int sum = a+b; //clculating every 3rd element in series b y summing of privious 2
        a=b; //updating privious element into next element
        b=sum; //update b to nearl created next element
        }

    }
}

