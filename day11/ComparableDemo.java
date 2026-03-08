package day11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparator {
    int id;
    String name;
    String dept;

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public Employee() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.id -e2.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}

class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
        // use of comparable
        //+
        //-
        //0
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(99);
        al.add(1);
        al.add(9);
        al.add(2);
        al.add(3);
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        ArrayList<Student> arrayList=new ArrayList<>();
        Student s1=new Student(11,"raj");
        Student s2=new Student(1,"vinay");
        Student s3=new Student(88,"simran");
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        ArrayList<Employee> emp=new ArrayList<>();
        Employee e1=new Employee(11,"Rohan","IT");
        Employee e2=new Employee(6,"Rohan","IT");
        Employee e3=new Employee(9,"Rohan","IT");

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        System.out.println(emp);
        Collections.sort(emp,new Employee());
        System.out.println(emp);
    }
}