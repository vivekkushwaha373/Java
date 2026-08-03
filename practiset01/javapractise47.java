package practiset01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


class Student{
    String name;
    Student(String name){
        this.name = name;
    }

    public String toString(){
        return "{"+name+"}";
    }

    public String getName() {
        return name;
    }
}

public class javapractise47 {
    public static void main(String[] args) {
        // Collection

        List<Student> list = new ArrayList<>();
        list.add(new Student("vivek"));
        list.add(new Student("Ayush"));
        list.add(new Student("Abhishek"));

        list.stream().filter(x -> x.name.startsWith("A")).forEach(System.out::println);

        List<Integer> list2 = new ArrayList<>(List.of(1,5,2,2,2));

        // System.out.println(list2.stream().filter(x->x%2==0).map(x->x*3).toList());
        // Optional<Integer> val =  list2.stream().filter(x->x>1).map(x->x*2).peek(System.out::println).sorted().findFirst();
        // long ans = list2.stream().filter(x->x>1).map(x->x*2).sorted().count();
        // System.out.println(ans);
        
        // System.out.println(val.get());
        
    }
}
