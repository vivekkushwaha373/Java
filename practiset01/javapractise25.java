package practiset01;

import java.util.ArrayList;
import java.util.List;

class CustomList {
    List<Integer> list = new ArrayList<>();

    public CustomList(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

    }

    List<Integer> getList() {


        return list;
    }

}

public class javapractise25 {
    public static void main(String[] args) {
         CustomList cl = new CustomList();
         List<?> li  = cl.getList();
         System.out.println(li.get(0));
    }
}
