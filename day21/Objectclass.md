<!-- Core Methods -->
1. toString   // className@hashcode default implementation
2. hashcode   // returns an Integer of an Object   use return Objects.hash(name,age);
3. getClass  // return runtime class of an Object     u can use getClass().getName()

class Object{
    public final Class<?> getClass(){
        // default
    }
}


4. equals   // this == s2 default implementation

<!-- Cloning -->
1. clone

class Object{
    protected Object clone() throws CloneNotSupportedException{
        //default
        if(this implements Clonable)
        //allow
        else
        don't allow
    }
} 

u can not call this directly u need to implemnt Clonable interface 

<!-- Garbage Collection -->
finalize

<!-- Threads -->
1. wait()
2. notify()
3. notifyAll()
