package day20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamjavademo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> st = list.stream();
        st.filter(x->x>2).map(x->x*2).forEach(x->System.out.println(x));

    }
}
