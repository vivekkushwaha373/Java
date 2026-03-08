package day12;
public class genericdemo {
 public static void main(String[] args) {
    Student<String > st = new Student<>();
    st.setValue("helloji");
    String val = st.getvalue();
    System.out.println(val);
 }    
}
