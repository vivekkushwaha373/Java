package day03;

public class stringpractise {
    public static void main(String[] args) {
        String a = "helrlohel";
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
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.concat(" ji how are you"));
        System.out.println(a.toCharArray());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.isBlank());
        System.out.println(a.isEmpty());
        System.out.println(a.replace('l', 'd'));
        System.out.println(a.repeat(3));
        System.out.println(a.hashCode());
        System.out.println(a.replaceAll("hel", "h"));
        System.out.println(a.replaceFirst("h", "g"));
        // System.out.println();

        // System.out.println(a.);
    }
}
