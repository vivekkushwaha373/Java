package practise;

import java.util.ArrayList;

//Let's Understand the code well

class Helloworld{
    private Object value;
    <T>Helloworld(T item){
      System.out.println(item);
    }
    void setValue(Object val){
        value =val;
    }
    Object getValue(){
        return value;
    }
}

interface useMe<T>{
    //declaration
    T getItem(T Item);
    void readItem(T Item); 
}

class ForInterface<T> implements useMe<T>{

   public T getItem(T item){
      return item;
   }
   public void readItem(T item){
    System.out.println(item);
   }
  
    public <U> void helloji(U printme){
       System.out.println(printme);
    }


}

public class genericsDemo {
    public static void main(String[] args) {
         
        Helloworld ob = new Helloworld();
        ob.setValue("Vivek is a greate person");
        String ans = (String) ob.getValue();
        System.out.println("Response is = "+ans);

    }

   
}
