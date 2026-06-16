package day15;

//Member Inner Class Demo

class GreetMe{
     int x=0;
    class helloji{
        int x=9;
         void display(){
            System.out.println("Hello ji this is love babber "+x);
            System.out.println("Hello ji this is love babber "+ GreetMe.this.x);
            System.out.println("Hello ji this is love babber "+ (GreetMe.this.x + 98));
         }
    }
}
public class MemberInnerClass {
    void main(String[] args) {
         GreetMe.helloji ob = new GreetMe().new helloji();
         ob.display();
    }
}
