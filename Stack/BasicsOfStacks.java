package Stack;
import java.util.Stack;
public class BasicsOfStacks {
    public static void main(String[] args) {
        
    
        Stack<Integer> st = new Stack<>();
        System.out.println("size is: " +st.size()); // size is: 0
        System.out.println(st); // []
        System.out.println(st.isEmpty()); // true
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // peek
        System.out.println(st.peek()); // 5
        System.out.println(st);  // [1,2,3,4,5]
        st.pop();
        System.out.println(st); // [1,2,3,4]
        while(st.size()>2){
            st.pop();
        }
        System.out.println(st); // [1,2]
        System.out.println(st.isEmpty()); // false
    }
}
