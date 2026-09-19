package test01;
abstract class Teacher{
    public String name;
    public Integer salary;
    Teacher(String name,Integer salary){
        this.name=name;
        this.salary = salary;
    }
    public abstract String getname();
    public void defaultmethod(){
        System.out.println("this is default method");
    }

    public static void staticMethod(){
        System.out.println("this is static method");
    }
}

class Mother extends Teacher{
    public Mother(String name,Integer salary){
         super(name,salary);
    }
    public String getname(){
        return name;
    }
}
public class TeacherDemo {
    public static void main(String[] args) {
        Mother m = new Mother("Zainab",20000);
        System.out.println(m.getname());
        m.defaultmethod();
        m.staticMethod();
    }
}
