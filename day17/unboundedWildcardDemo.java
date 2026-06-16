package day17;

// in unbounded wildcard T is percieved as Object and can only access methods and properties of Onject

class Greet<T>{
     private T value;
     // write is not allowed
    //  void setValue(T value){
    //     this.value = value;
    //  }   
     void getValue(){
      System.out.println(this.getClass());
     }
}

public class unboundedWildcardDemo {
    public static void main(String[] args) {
        Greet<?> ob = new Greet<>();
        // ob.setValue(2);
        // ob.setValue("hello ji");
        ob.getValue();
    }
}
