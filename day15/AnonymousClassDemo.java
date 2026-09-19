package day15;


// class Student{
//     String name;
    
//     Student(String name){
//         this.name=name;
//     }
    
//     String getName(){
//    return "";
//     }


// }


interface Student{
    
    String getName();


}
public class AnonymousClassDemo {
    
    public static void main(String[] args) {
        
        Student s = new Student() {
             String name="vivek";
             @Override 
             public String getName(){
                return name;
             }
        };

        System.out.println(s.getName());

    }


}
