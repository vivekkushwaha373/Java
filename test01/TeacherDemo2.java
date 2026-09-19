package test01;

public class TeacherDemo implements Teacher{
    public String getName(){
        return Teacher.name;
    }
    
}

public class TeacherDemo2 {
   public static void main(String[] args) {
     TeacherDemo t = new TeacherDemo();
     t.displayDetails();
     System.out.println(t.name);
     t.staticmember();
   }
}

