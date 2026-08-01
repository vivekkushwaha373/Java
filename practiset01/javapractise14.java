package practiset01;

class Student{
    String name;
    int roll_no;
   
        name="vivek";
        roll_no = 23;
    

    void displaydata(){
        System.out.println("Roll no is: "+roll_no);
        System.out.println("name is"+name);
    }


}





public class javapractise14 {

    final static int var;
    static {
        var=2;
    }
    public static void main(String[] args) {
        Student s1 = new Student("vivek", 0);
      s1.displaydata();
      System.out.println(var);  
     }
}
