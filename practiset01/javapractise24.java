package practiset01;

class Student<T>{
    
    String name;
    int roll_no;

    static <T> T identity(T value){
        return value;
    }

    void getValue(T val){
       System.out.println(val);
     }



}

public class javapractise24 {
    public static void main(String[] args) {
        Student <Integer>s1 = new Student<>();
        System.out.println(Student.identity("hello"));
        System.out.println(Student.identity(1));
        Student.identity(null);
        s1.getValue(2);
        s1.getValue(3);
        s1.getValue(4);
        s1.getValue(5);

    }
}
