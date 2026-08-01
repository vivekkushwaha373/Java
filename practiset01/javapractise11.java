package practiset01;
// HERE WE WILL BE STUDYING ABOUT ABSTRACT CLASS IN JAVA
// Static method is hidden not overridden

abstract class Student{
     int roll_no;
     String name;
     //abstract method can also have constructor
     Student(int roll_no,String name){
       this.roll_no=roll_no;
       this.name=name;
     }

     //making static methods with abstract class
     static void getNothing(){
        System.out.println("Here I am getting nothing");
     }

     void getSomething(){
        System.out.println("Here I am getting something");
     }


    //making abstract methids
    abstract void getname();
    abstract void getrollno();
}

class StudentDefine extends Student{
    StudentDefine(int roll_no,String name){
        super(roll_no,name);
    }
    
    static void getNothing(){
        System.out.println("Here I am getting nothing: ");
    }
    
    @Override
    void getname(){
        System.out.println(name);
    }
    @Override
    void getrollno(){
      System.out.println(roll_no);
    }
}

public class javapractise11 {
    public static void main(String[] args) {
        StudentDefine st = new StudentDefine(2, "Rohit");
        st.getname();
        st.getrollno();
        st.getSomething();
        StudentDefine.getNothing();
    }
}
