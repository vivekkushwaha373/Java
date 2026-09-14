
class public Student{  
   
    private String name;
    private Integer age;
   
    public static Student student;
    // no one should be able to create a class
    private Student(){}
   

    public static Student getInstance(){
        
        if(student == null){
            student = new Student();
            return student;
        }

        return student;
    }

    public setName(String name){
        this.name = name;
    }

    public setAge(int age){
        this.age = age;
    }
    
    @Override
    public String toString(){
        return  "{ name: "+name+", age: "+age+" }";
    }

}