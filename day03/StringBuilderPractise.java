package day03;

public class StringBuilderPractise {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello ji");
        System.out.println(str);
        
        System.out.println(str.append(" My name is Love babber"));
        System.out.println(str.reverse());
        System.out.println(str.capacity());
        System.out.println(str.charAt(0));
        str.setCharAt(0, 'u');
        System.out.println(str.substring(0, 7));
        // System.out.println(str.s);
        System.out.println(str);
        System.out.println(str.repeat("str", 1));
        System.out.println(str.repeat("str", 2));
        System.out.println(str.replace(0, 3, "ki"));
        System.out.println(str.insert(1, 'j'));
        System.out.println(str.deleteCharAt(0));
        System.out.println(str.delete(0,4));
        System.out.println(str.capacity());
        // System.out.println(str.append());
        System.out.println(str.lastIndexOf("i"));


    }
}
