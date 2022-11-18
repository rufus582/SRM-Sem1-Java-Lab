import java.util.EmptyStackException;
import java.util.Stack;

public class Lab_11_Stack {
    static void showPush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push("+a+")");
        System.out.println("Stack: "+st);
    }

    static void showPop(Stack<Integer> st) {
        Integer a = st.pop();
        System.out.println("pop("+a+")");
        System.out.println("Stack: "+st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st);

        showPush(st, 23);
        showPush(st, 37);
        showPush(st, 29);
        showPop(st);
        showPop(st);
        showPop(st);

        try {
            showPop(st);
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack!!!");
        }
    }
}
