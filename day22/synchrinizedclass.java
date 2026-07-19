package day22;

public class synchrinizedclass {
    public static void main(String args[]) {

        Student st = new Student("vivek", 23);

        Thread t1 = new Thread(() -> {
            System.out.println(st.getname());
        });
        Thread t2 = new Thread(() -> {
            System.out.println(st.getrollno());
        });

        t1.start();
        t2.start();

    }
}

class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    String getname() {
        synchronized (Student.class) {

            System.out.println("TREAD 1: " + Thread.currentThread().getName() + "starts");

            try{
                Thread.sleep(2000);
            }catch(Exception e){}

            System.out.println("TREAD 1: " + Thread.currentThread().getName() + " Ends");

            return name;
        }
    }

    int getrollno() {
        synchronized (this) {
            System.out.println("TREAD 2: " + Thread.currentThread().getName() + "starts");

            System.out.println("TREAD 2: " + Thread.currentThread().getName() + "ends");

            return rollno;
        }
    }

}