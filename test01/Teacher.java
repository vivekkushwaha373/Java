package test01;

interface Teacher {
    String name="vivek";
    Integer salary=20000; 
    // static method
    static void staticmember(){
        System.out.println("This is static method");
    } 
    // abstract method
    String getName();
    
    default void displayDetails(){
        System.out.println(name+" and "+salary);
    }
}
