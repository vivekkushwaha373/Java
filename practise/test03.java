package practise;

class Student{
   
    String name;
    
    Student(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }
}
public class test03 {
    public static void main(String[] args) {
        Student st = new Student("Vivek");
        System.out.println(st.getName());
        // System.out.println(st.);
    }
}
