package DecoratorDesignattern;

public class Student implements Credentials{
   private String name;
   private Long mobileNumer;
  
    public Student(String name, Long mobileNumer) {
        this.name = name;
        this.mobileNumer = mobileNumer;
    }
  
    public String getName(){
        return name;
    }

    public Long getMobileNumber(){
        return mobileNumer;
    }


   void getCredential(){
        System.out.println("name: "+name);
        System.out.println("mobilenumber: "+mobileNumer);
   } 
}
