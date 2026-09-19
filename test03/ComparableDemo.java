package test03;

class Student implements Comparable<Student> {
    public String name;
    public Integer rollno;

    public Student(String name,Integer rollno){
       this.name = name;
       this.rollno = rollno;  
       
       
    }

    public int compareTo(Student o) {
       
        if(o.rollno.intValue() == this.rollno.intValue() && (name.compareTo(o.name)==0))
        {  
            //   System.out.println("ans is: "+ans);
            return 0;
        }
        else{
            return 1;
        }
    };

}

public class ComparableDemo {
     public static void main(String[] args) {
        Student st1 = new Student("vivek",300);
        if(st1.compareTo(new Student("vive", 300)) == 0){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
     }
}
