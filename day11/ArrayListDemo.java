package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


// Array list initialcapacity is 10 
// capacity vs size interview question
// when capacity is full then it size increased to 1.5  

public class ArrayListDemo {
 
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); // List is one collection interface and ArrayList is part of collections
        nums.add(10);
        nums.add(11);
        nums.add(12);
        nums.add(13);

        nums.add(3,8);
        nums.set(2,5);
        nums.remove(1);
        System.out.println(nums);
        System.out.println(nums.get(2));
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());

        // nums.clear();
        
        Iterator<Integer> it = nums.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println(nums);
        System.out.println(nums.isEmpty());

        List<String> num2 = Arrays.asList("ram","sita","gita");
        num2.add("shyam"); // this is not possible Arrays.asList only allows u replace exiating element of fixed size
        System.out.println(num2); // Hence this will give runtime error
        num2 = new ArrayList<>(Arrays.asList("ram","radha")); // here u can also do modification along with replacement
        num2 = List.of("nita","gita","sita");// it is completely immutable 
        
        // Note : remove is used to remove element using index as well as index itself 
        // in case of numbers suppose u have element 1 and remove(1) it will not remove element 1 however it will remove element at index 1
        // to remocve element itself u should pass remove(Integer.valueOf(1)) 


        // list.addAll(list2)// it appends element list2 to list
        // list.toArray(new Integer[0]);


    }

}
