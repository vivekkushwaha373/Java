package practiset01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class javapractise46 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Stream<Integer> st = list.stream();
        st = st.filter(x->x>3);
        st = st.map(x->x*5);
        st.forEach(System.out::println);
        
    }
}
