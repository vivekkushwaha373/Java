package practiset01;

public class javapractise57 {
  static int cnt=0;
  public static void main(String[] args) {
    Thread t1 = new Thread(()->{
        for(int i=0;i<100000;i++){
            cnt++;
        }
    });
    Thread t2 = new Thread(()->{
        for(int i=0;i<20000;i++){
            cnt++;
        }
    });

    t1.start();
    t2.start();
    try{

        Thread.sleep(500);
    }catch(Exception e){}

    System.out.println(cnt);

  }   
}
