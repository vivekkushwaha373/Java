package practiset01;

class Student{

    String college;
    String name;
    // Student(){}

    Student(String college,String name){
        this.college=college;
        this.name=name;

    }

    void displayname(){
        System.out.println(name);
    }

    void displaycollege(){
        System.out.println(college);
    }

}

class Mohan extends Student{
   
    String name;
    Mohan(String name, String college){
        super(college,"vivek");
        this.name=name;
    }

    @Override
    void displaycollege(){
        System.out.println(name+" bachha DU ka hai "+super.name);
    }

}

public class javapractise08 {
    public static void main(String[] args) {
        // Student st = new Student();
        // st.displayname();
        // st.displaycollege();
        Student st2 = new Student("JNU","vivek");
        st2.displayname();
        st2.displaycollege();
        Student st3 = new Mohan("Mohan","JNU");
        st3.displaycollege();
        

    }
}
