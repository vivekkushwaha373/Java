package day08.sync;

public class TablePrintWithMethod {
    public void printTable(int n){
        synchronized(this){
            for(int i=0;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" "+(i+1));
                try{
                   Thread.sleep(500);
                }
                catch(InterruptedException e){
                   e.printStackTrace();
                }
            }
        }
    }
}
