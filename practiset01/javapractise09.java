package practiset01;

class Student{

    String college="JNU";
    String name="vivek";
    // Student(){}

    // Student(String college,String name){
    //     this.college=college;
    //     this.name=name;

    // }

    void displayname(){
        System.out.println(name);
    }

    void displaycollege(){
        System.out.println(college);
    }

}

class Mohan extends Student{
   
    String name="Rohit";
    // Mohan(String name, String college){
    //     super(college,"vivek");
    //     this.name=name;
    // }

    @Override
    void displaycollege(){
        System.out.println(name+" bachha DU ka hai "+super.name);
    }

}

public class javapractise09 {
    public static void main(String[] args) {
        // Student st = new Student();
        // st.displayname();
        // st.displaycollege();
        Student st2 = new Student();
        st2.displayname();
        st2.displaycollege();
        Student st3 = new Mohan();
        st3.displaycollege();
        

    }
}

