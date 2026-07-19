package day22;

// Here the CPU cycle is wasted
// called busy waiting

class producerConsumerDemo {

    public static void main(String[] args) {

        Student st = new Student();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                st.Producer("vivek" + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
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

    synchronized void Producer(String name) {
        while (flag == true) {
            try {

                wait();
            } catch (Exception e) {
            }
        }
        this.name = name;
        flag = true;
        System.out.println("Producer produces: " + name);
        notify();

    }

    synchronized void Consumer() {
        while (flag == false) {
            try {

                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("consumer consumes: " + name);
        name = null;
        flag = false;
        notify();
    }

}
