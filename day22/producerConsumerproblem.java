package day22;

// Here the CPU cycle is wasted
// called busy waiting

class producerConsumerDemo {

    public static void main(String [] args){


       Student st = new Student();

        Thread t1 = new Thread(()->{
             for(int i=0;i<10;i++){
                st.Producer("vivek"+i);
             }
        });

        Thread t2 = new Thread(()->{
            for(int i=0; i<10; i++){
                st.Consumer();
            }
        });

        t1.start();
        t2.start();

    }

}

class Student {

    volatile String name;
    volatile boolean flag = false;

    void Producer(String name) {
        while (flag == true) {
           
        }
        this.name = name;
        flag = true;
        System.out.println("Producer produces: " + name);

    }

    void Consumer() {
        while (flag == false) {
          
        }
        System.out.println("consumer consumes: " + name);
        name = null;
        flag = false;
    }

}
