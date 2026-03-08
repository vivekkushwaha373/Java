package day12;

public class Student<T> {
    
    private T value;

    void setValue(T val){
         value=val;
    }

    T getvalue(){
        return value;
    }

}
