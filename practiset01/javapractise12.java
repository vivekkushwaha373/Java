package practiset01;

interface Student1 {

    String name = "vivek"; // public static final
    int roll_no = 23; // public static final

    static void helloji() {
        System.out.println("Greet hello ji");
    }

    void publicFF();

    default int randomInt(){
        return (int)(Math.random()*10)%10;
    }

}

interface Student2 {

    String name = "vivek";
    int roll_no = 23;

    static void helloji() {
        System.out.println("Greet hello ji");
    }

    void publicF();

}

class AllStudent implements Student1, Student2 {

    String name;

    AllStudent(String name) {
        this.name = name;
    }

    @Override
    public void publicF() {
        System.out.println("Public hain bhai");
    }

    public void publicFF() {
        System.out.println("Public hain bhai");
    }
}

public class javapractise12 {
    public static void main(String[] args) {
        AllStudent s1 = new AllStudent("hii");
        System.out.println(Student1.name);
        s1.publicF();
        System.out.println(s1.randomInt());
    }
}
