package day03;

public class stringpractise {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = "hello %d";
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
        System.out.println(a==b);
        System.out.println(a.split(""));
        System.out.println(String.format("vivek %d", 2));
        System.out.println(c.format("vivek %d", 2));
        System.out.println(a.indexOf("lloo"));
        System.out.println(a.contains("ello"));
        System.out.println(a.substring(0,4));
        System.out.println();
    }
}
