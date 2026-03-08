package day11;

import java.util.ArrayList;
import java.util.List;

class student{
    int id;
    String name;
    String course;
    student(int id,String name, String course){
        this.id= id;
        this.name= name;
        this.course= course;
    }

    @Override
    public String toString(){
        return "{id = "+id+", name = "+name + " , course = "+course+"}"; 
    }
}
public class CustomList {
    public static void main(String[] args) {
        student s1 = new student(0, "dakait", "DSA");
        student s2 = new student(1, "rohit", "JS");
        student s3 = new student(2, "zainab", "C++");
        
        List<student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println(studentList);
    }
}
