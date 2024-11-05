package Stack;
import java.util.Stack;

public class ArrayImplemention {
public static class Stack{
    private int [] arr = new int[50];
    private int idx = 0;
    void push(int x){
        if(isFull()){
    System.out.println("Stack is full");
    return;
        }
        arr[idx] = x;
        idx++;
    }
    int peek(){
        if(idx == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[idx -1];
    }
    int pop(){
        if(idx == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        int top = arr[idx - 1];
        arr[idx - 1] = 0;
        idx--;
        return top;
    }
    void display(){
        for(int i=0; i<= idx-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(idx == 0) return true;
        else return false;
    }
    boolean isFull(){
        if(idx == arr.length) return true;
        else return false;
    }
    int capacity(){
        return arr.length;
    }
}
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display(); // 1
        st.push(2);
        st.display(); // 1 2
        st.push(3);
        st.display(); // 1 2 3
        System.out.println(st.size()); //3
        st.pop();
        st.display(); // 1 2
        System.out.println(st.size()); // 2
        st.push(7);
        st.push(8);
        st.display(); // 1 2 7 8
        System.out.println(st.isFull());
}
}
