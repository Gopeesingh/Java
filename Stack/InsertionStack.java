package Stack;
import java.util.Stack;
public class InsertionStack {
    public static void main(String[] args) {
    Stack<Integer> st = new Stack <>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st); // 1 2 3 4 5
    int idx = 0;
    int x = 12;
    Stack<Integer> rt = new Stack <>();
    while(st.size()>idx){
    rt.push(st.pop());
    }
st.push(x);
while(rt.size()>0){
    st.push(rt.pop());
}
System.out.println(st); // [12,1,2,3,4,5]
    }
}

