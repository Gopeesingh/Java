package Stack;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack <>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st); // 1 2 3 4 5
        Stack<Integer> gt = new Stack <>();
        while(st.size()>0){
        // // int x = st.peek();
        // // gt.push(x);
        // // st.pop();
        // gt.push(st.pop());
        // }
        // System.out.println(gt); // [5, 4, 3, 2, 1]
        // copy Stack
        gt.push(st.pop());
    }
    Stack<Integer> rt = new Stack<> ();
    while(gt.size()>0){
        rt.push(gt.pop());
    }
    System.out.println(rt);
}
}