
// Let's Learn Immutable class Ke Bare Mein

package practiset01;

import java.text.CollationElementIterator;

public class javapractise27 {
    public static void main(String[] args) {

       College col = new College("JNU","Delhi");
       Primary ob = new Primary("Vivek", "45", col);
       ob.DisplayAllfields();
       ob.getCollegeinfo().name = "DU";
       ob.DisplayAllfields();

    }
}


final class Primary{
    final String studentname;
    final String studentroll_no;
    final College collegeinfo;
    
    Primary(String name,String roll_no,College info){
        this.studentname = name;
        this.studentroll_no = roll_no;
        this.collegeinfo = info;
    }

    public College getCollegeinfo() {
        // return collegeinfo; Avoid doing this 
        return new College(this.collegeinfo.name, this.collegeinfo.Address);
    }
    public String getStudentname() {
        return studentname;
    }
    public String getStudentroll_no() {
        return studentroll_no;
    }
    public void DisplayAllfields(){
        System.out.println("STUDENT NAME: "+ studentname);
        System.out.println("STUDENT ROLLNO: "+studentroll_no);
        System.out.println("COLLEGE INFO: "+collegeinfo.name + " -  ," + collegeinfo.Address);
    }
} 

class College{
    String name;
    String Address;
    College(String name, String Address){
        this.name = name;
        this.Address = Address;
    }

}