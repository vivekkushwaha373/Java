package practiset01;

public class javapractise21 {
    public static void main(String[] args) {
        final int roll_no =23;
        class Student{
          private String name;
          private Student(String name){
             this.name = name;
          }

          int roll_no(){
            return roll_no;
          }
          String getName(){
            return name;
          }
        }

        Student st = new Student("Vivek");
        System.out.println(st.getName());
        System.out.println(st.roll_no());
    }
}
