package day16;


// compiler generated code

// final class sayHello extends Enum<sayHello> {

//     public static final sayHello SUNDAY = new sayHello(1, "SUNDAY", 0);
//     public static final sayHello MONDAY = new sayHello(2, "MONDAY", 1);
//     public static final sayHello TUSEDAY = new sayHello(3, "TUSEDAY", 2);

//     int x;

//     private sayHello(int x, String name, int ordinal) {
//         super(name, ordinal);
//         this.x = x;
//     }
// }

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

