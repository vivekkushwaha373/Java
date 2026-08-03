package practiset01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//let's study collector interface
public class javapractise50 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5,6));
        // List<Integer> list  = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(list);
        // System.out.println(list.stream().map(x->x*2).collect(Collectors.toList()));
        // Set<Integer> set = list.stream().map(x->x*2).collect(Collectors.toSet());
        // System.out.println(set);
        Map<Integer,Integer> mp = list.stream().map(x->x*2).collect(Collectors.toMap(x->x+1, x->x));
        System.out.println(mp);
        

    }
}
