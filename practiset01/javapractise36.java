package practiset01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class javapractise36 {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(6);
        // st.add(null);
        System.out.println(st.add(null));
        System.out.println(st.add(null));
        st.remove(null);
        System.out.println(st.containsAll(List.of(1,2,3)));
        st.addAll(List.of(1,2,3,4,5,6,7,8,9,10,10));
        Integer [] arr =  st.toArray(new Integer[0]);
        System.out.println(arr.length);
        System.out.println(st);
    }   
}
