package day15;

class GreetMe{
    
    static class Helloji{
       void display(){
        System.out.println("Helloji this is love babber");
       }
    }
}

public class NestecclassDemo {
void main(String[] args) {
        GreetMe.Helloji ob = new GreetMe.Helloji();
        ob.display();
    }    
}
