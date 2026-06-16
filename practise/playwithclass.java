package practise;

import day01.simpleInterest;

class printDemo {
    int rollno;
    String name;
    static void printkaro(int a) { // this can be invoked both by class as well as 
        System.out.println(a);
    }

    static void printkaro(String a) {
        System.out.println(a);
    }

}

public class playwithclass {

    public static void main(String[] args) {
     
        printDemo ob = new printDemo();
        ob.printkaro("vivek");
        ob.printkaro(2);
        System.out.println(ob.rollno);
        System.out.println(ob.name);
    }
}
