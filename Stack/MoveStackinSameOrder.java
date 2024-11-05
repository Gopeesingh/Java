package Stack;
import java.util.Stack;
import java.util.Scanner;
public class MoveStackinSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
       int n;
       System.out.println("Enter element you want to insert"); // 5
       n = sc.nextInt();
       System.out.println("Enter the elements: "); // 1 2 3 4 5
       for(int i=1; i<=n; i++){
        int x= sc.nextInt();
        st.push(x);
       }
       System.out.println(st); // [1,2,3,4,5]
    }
}
