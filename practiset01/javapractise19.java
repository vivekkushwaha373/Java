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

    College st = new College("name", "name");

    class College{
         String name;
         String address;
         static int student_id = 3;
        private College(String name, String address){
            this.name = name;
            this.address = address;
         }

         public String getName() {
            //  return name;
            return Student.this.name + " " + College.this.name;
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


public class javapractise19 {
    public static void main(String[] args) {
        Student st = new Student(3, "chainab");
        System.out.println(st.st.getName());
        st.student_id = 8;
        Student.College cl = new Student(23, "aditya").new College("JNU", "Delhi");
        System.out.println(cl.getAddress());
        System.out.println(cl.getName());
        System.out.println(cl.getid());
    }
}
