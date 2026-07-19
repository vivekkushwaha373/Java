package day22;

public class producerconsumerproblem01 {
    public static void main(String[] args) {
        Student st = new Student();

        Thread t1 = new Thread(()->{
            for(int i=0;i<10;i++)
            {
                st.Producer("vivek"+i);
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<10;i++)
            {
                st.consumer();
            }
        });

        t1.start();
        t2.start();
    }   
}

class Student{
    String name;
    boolean flag= false;

    void Producer(String name){
       this.name = name;
       flag = true;
       System.out.println("Producer produces: "+ name);
    }

    void consumer(){
      System.out.println("Consumer consumes: "+ name);
      name = null;
      flag= true;
    } 
} 
