package practiset01;

// anonymous class ke bare mein

class Student {
    int roll_no;
    String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

}

public class javapractise22 {
    public static void main(String[] args) {
        Student s1 = new Student(23, "vivek") {
            String name;

            {
                name = "vivek";
            }

            public String getName() {
                return "Mr: " + name;
            }

            public int getRoll_no() {
                return roll_no + 20;
            }

        };

        System.out.println(s1.getName());
        System.out.println(s1.getRoll_no());
    }
}
