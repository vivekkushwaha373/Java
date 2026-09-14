package prototypedesignPattern;

import java.util.ArrayList;
import java.util.List;

class StudentImpl{

    private String name;
    private Integer age;

    List<String> interest;
    
    public StudentImpl(String name, Integer age, List<String> interest){
        System.out.println("Initialiting Object : "+name+" and "+age);
        
        try{
             Thread.sleep(2000);
        }catch(InterruptedException e){

        }

        
        this.name = name;
        this.age = age;
        this.interest = interest;

    }
    
     // copy constructor creation
    private StudentImpl(StudentImpl stu){
        this.name = stu.name;
        this.age = stu.age;
        this.interest = stu.interest;
    }

   
   public StudentImpl customclone(){
           return new StudentImpl(this);
   }


    void setName(String name){
       this.name = name;
    }

    String getName(){
        return name;
    }

    void setAge(Integer age){
        this.age=age;
    }

    int getAge(){
        return age;
    }
}

public class Student {
   public static void main(String [] args){
     
      Long start = System.currentTimeMillis();
    //   StudentImpl stu1 = new StudentImpl("vivek",23,List.of("SAINGING","DANCING"));
    //   StudentImpl stu2 = new StudentImpl("vivek",24,List.of("SAINGING","DANCING"));
    //   StudentImpl stu3 = new StudentImpl("vivek",25,List.of("SAINGING","DANCING"));
    //   StudentImpl stu4 = new StudentImpl("vivek",26,List.of("SAINGING","DANCING"));
    //   StudentImpl stu5 = new StudentImpl("vivek",27,List.of("SAINGING","DANCING"));
    //   StudentImpl stu6 = new StudentImpl("vivek",28,List.of("SAINGING","DANCING"));

      StudentImpl stu1 = new StudentImpl("vivek",23, List.of("SAINGING","DANCING"));
      StudentImpl stu2 = stu1.customclone();
      StudentImpl stu3 = stu1.customclone();
      StudentImpl stu4 = stu1.customclone();
      StudentImpl stu5 = stu1.customclone();
      StudentImpl stu6 = stu1.customclone();

      Long timetaken = System.currentTimeMillis() - start ;

      System.out.println("time taken: "+timetaken);
    
   }    

}



