package practiset01;

final class Student{
    String name;
    int roll_no;
    Student(String n,int r){
        name=n;
        roll_no = r;
    }

    void displaydata(){
        System.out.println("Roll no is: "+roll_no);
        System.out.println("name is"+name);
    }


}



public class javapractise13 {
     public static void main(String[] args) {
      Student s1 = new Student("vivek", 0);
      s1.displaydata();  
     }
}
