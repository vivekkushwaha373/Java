package practiset01;

public class javapractise64 {
    public static void main(String[] args) {
        Student st = new Student("vviek", 1);
        Student st1 = new Student("vviek", 2);
        Thread t1 = new Thread(() -> {
            System.out.println("t1 starts");
           
            System.out.println(st.getName());
            System.out.println("t1 ends");
        });
        Thread t2 = new Thread(() -> {
            System.out.println(st1.getRoll_no());
        });

        t1.start();
        try {

            t1.join(500);
        } catch (Exception e) {
        }
        t2.start();

    }
}

class Student {
    String name;
    int roll_no;

    Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

     public String getName() {
        synchronized(this){
            try {
   
                   Thread.sleep(3000);
               } catch (Exception e) {
               }
           return name;

        }
    }

    public int getRoll_no() {
        synchronized(this){

            return roll_no;
        }
    }

}