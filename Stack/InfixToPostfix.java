package Stack;
import java.util.*;
public class InfixToPostfix {
    
    public static void main(String[] args) {
        String Infix = "9-(5+3)*4/6";
       // 9-(5+3)*4/6
       // 9 - 53+ * 4 / 6
    // 9 - 53+4* / 6
    // 9 - 53+4*6/
    // 953+4*6/-
        System.out.println(Infix);
        Stack<String>val = new Stack<>();
        Stack<Character>op = new Stack<>();
        for(int i=0; i<Infix.length(); i++){
            char ch = Infix.charAt(i);
            int ascii = (int) ch;
            // '0' -> 48 and '9' -> 57
            if(ascii >= 48 && ascii <= 57){ // 0 to 9
            String s ="" + ch;
            val.push(s);
            }
            else if(op.size() == 0  || ch ==  '(' || op.peek() == '(')
            op.push(ch);
            else if(ch == ')'){
            while(op.peek() != '('){
                // work
                String v2 = val.pop();
                String v1 = val.pop();
                char o = op.pop();
                String t = v1 + v2 + o;
                val.push(t);
            }
            op.pop(); // '(' hata diya
            }
            else{
                if(ch == '+' || ch == '-'){
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    val.push(t);
            // push
            op.push(ch);
            }
            if(ch == '*' || ch == '/'){
                if(op.peek() == '*' || op.peek() == '/'){
                //work
                String v2 = val.pop();
                String v1 = val.pop();
                char o = op.pop();
                String t = v1 + v2 + o;
                val.push(t);
                // push
                op.push(ch);
            }
            else op.push(ch);
        }
        }
        }
        // val stack size -> 1
        while(val.size() > 1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = v1 + v2 + o;
            val.push(t);
        }
        String postfix = val.pop();
        System.out.println(postfix);
    }
}
