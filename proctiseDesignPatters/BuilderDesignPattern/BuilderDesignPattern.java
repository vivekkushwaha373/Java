package BuilderDesignPattern;

class Student {

    private String name;
    private Integer age;
    private Integer rollNo;

    static StudentBuilder builder() {
        return new StudentBuilder();
    }

    Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.rollNo = builder.rollNo;
    }

@Override
public String toString() {
return "Student{" +
"name='" + name  +
", age=" + age +
", rollNo=" + rollNo +
"}";
}


    static class StudentBuilder {
        String name;
        Integer age;
        Integer rollNo;

        StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        StudentBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        StudentBuilder rollNo(Integer rollno) {
            this.rollNo = rollno;
            return this;
        }

        Student build() {
            return new Student(this);
        }

    }

}

public class BuilderDesignPattern {
   public static void main(String[] args) {
      Student st = Student.builder()
                   .name("vivek")
                   .age(23)
                   .rollNo(21)
                   .build();
    System.out.println(st);
   }
}
