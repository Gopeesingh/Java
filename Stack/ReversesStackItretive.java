package Stack;
import java.util.Stack;
public class ReversesStackItretive {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st); // [1 2 3 4 5]
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt); //[5 4 3 2 1]
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
        gt.push(rt.pop());
    }
    System.out.println(gt); // [1 2 3 4 5]
    while(gt.size()>0){
        st.push(gt.pop());
    }
    System.out.println(st); //[5 4 3 2 1]
}
}
