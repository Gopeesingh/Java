package Stack;
import java.util.Stack;
public class RemoveFromBottomStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack <>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer> rt = new Stack <>();
        while(st.size()>1){
        rt.push(st.pop());
        }
        System.out.println(rt); // [5,4,3,2,]
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
            System.out.println(st); // [2,3,4,5]
    }
}
