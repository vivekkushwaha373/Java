package practise;

class randomclass1{

  int a;
   randomclass1(int a){
     this.a =a;
   }
}
class randomclass2 extends randomclass1{
   int b;
   randomclass2(int a,int b){
       super(a);
     this.b=b;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }

} 
public class thisandsuperdemo {
    public static void main(String[] args) {
        randomclass2 ob = new randomclass2(2, 3);
        ob.display();
    }
}
