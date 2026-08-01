package practiset01;

class Student{
    private String name;
    int roll_no;
    Student(String name, int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }

    private void displayname(){
        System.out.println(name);
    }

    void displaynamewithpublic(){
        displayname();
    }

    void displayroll_no(){
        System.out.println(roll_no);
    }
    
}

public class javapractise10 {
   public static void main(String[] args) {
       Student st = new Student("vivek",34);
       st.displayroll_no();
       st.displaynamewithpublic();
       System.out.println(st.roll_no);
    //    System.out.println(st.name);
   }   
}
