package day11;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {
        
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println("pop "+st.pop());
        System.out.println("peek "+st.peek());
        System.out.println(st);

    }
}
