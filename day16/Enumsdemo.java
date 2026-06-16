package day16;

enum sayHello{
    SUNDAY(1), //what is this line public static final sayHello SUNDAY = new sayHello()
    MONDAY(2),
    TUSEDAY(3);
    int x;
    sayHello(int x){
        this.x=x;
    }
}

public class Enumsdemo {
    public static void main(String[] args) {
        System.out.println(sayHello.SUNDAY);
        System.out.println(sayHello.SUNDAY.x);
        System.out.println(sayHello.MONDAY.x);
        System.out.println(sayHello.MONDAY.ordinal());
        System.out.println(sayHello.MONDAY.valueOf("SUNDAY"));
        sayHello []obj = sayHello.TUSEDAY.values();
        for(sayHello ob:obj){
             System.out.println(ob);
        }

    }
}
