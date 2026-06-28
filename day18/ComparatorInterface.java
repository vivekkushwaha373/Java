package day18;

import java.util.*;

class Student {
    String name;
    int rollno;

    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}

class Shortname implements Comparator<Student>{
    @Override
    public int compare(Student ob1, Student ob2){
        return ob1.name.compareTo(ob2.name);
    }
}
class Shortrollno implements Comparator<Student>{
    @Override
    public int compare(Student ob1, Student ob2){
        return ob1.rollno - ob2.rollno;
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        List <Student> list = new ArrayList<>();
        list.add(new Student("rahul",3));
        list.add(new Student("mina",4));
        list.add(new Student("vivek",5));
        list.add(new Student("khushi",6));

        Collections.sort(list,new Shortname());
        for(Student li:list){
            System.out.println(li.name+", "+li.rollno);
        }
        Collections.sort(list,new Shortrollno());
        for(Student li:list){
            // System.out.println(li.rollno);
            System.out.println(li.name+", "+li.rollno);
        }
    }
}
