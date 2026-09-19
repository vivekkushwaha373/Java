package test03;

class Student implements Cloneable {

    public String name;
    public int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    void displayresult() {
        System.out.println("name is: " + name + " and rollno is: " + rollno);
    }

    public Student clone() throws CloneNotSupportedException {

        return (Student) super.clone(); //this is the default behavoir and it dows shallow copy

    }

}

public class ClassDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("vivek", 23);
        Student s2;
        s2 = s1.clone();
        s2.name = "rahul";
        s2.rollno = 34;
        s2.displayresult();
        s1.displayresult();
    }
}
