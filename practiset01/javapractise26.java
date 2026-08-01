package practiset01;

class Student<T>{

    T info;
    
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }

    public <T> T getsomemoreinfo(T val){
        return val;
    }
    
}
public class javapractise26 {
   public static void main(String[] args) {
      Student <? super Integer> s1 = new Student<>();
      s1.setInfo(2);
      System.out.println(s1.getInfo());
      System.out.println(s1.getsomemoreinfo("hello"));

   } 
}
