package day17;
class Greet<T extends Number>{
     private T value;
    //  write is not allowed
     void setValue(T value){
        this.value = value;
     }   
     void getValue(){
      System.out.println(value.shortValue());
     }
}

public class UpperBoundWildCard {
     public static void main(String[] args) {
        Greet<? extends Number> ob = new Greet<>();
        ob.setValue(2);
        // ob.setValue("hello ji");
        ob.getValue();
    }
}
