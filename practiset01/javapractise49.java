package practiset01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class javapractise49 {
    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,7};
        // Arrays.stream(arr).filter(x -> x.startsWith("A")).forEach(System.out::println);
        // Arrays.stream(arr).filter(x -> x.toLowerCase().startsWith("a")).forEach(System.out::println);
        // Arrays.stream(arr).filter(x -> x.toLowerCase().startsWith("a")).forEach(System.out::println);
        // System.out.println(Arrays.stream(arr).allMatch(x->x>=2));
        System.out.println(Arrays.stream(arr).noneMatch(x->x>=2));
        // System.out.println(Arrays.stream(arr).anyMatch(x->x>=2));


    }
}
