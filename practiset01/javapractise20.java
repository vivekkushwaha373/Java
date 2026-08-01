package practiset01;

//member inner class
class Student{
    int roll_no;
    String name;
    
    Student(int roll_no, String name){
         this.roll_no = roll_no;
         this.name = name;
    }

    static int student_id=10;

    static class College{
         String name;
         String address;
         static int student_id = 3;
         College(String name, String address){
            this.name = name;
            this.address = address;
         }

         public String getName() {
            //  return name;
            return name;
         }
         public int getid() {
            //  return name;
            return Student.student_id;
            
         }


         public String getAddress() {
             return address;
         }

    }


}


public class javapractise20 {
    public static void main(String[] args) {
       Student.College cl = new Student.College("JNU", "Delhi");
       System.out.println(cl.getAddress());
       System.out.println(cl.getName());
       System.out.println(cl.getid());
    }
}
