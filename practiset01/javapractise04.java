package practiset01;

public class javapractise04 {
    public static void main(String[] args) {
        String name = "vivekviv";
        System.out.println(name.length());
        System.out.println(name.concat(" helloji"));
        System.out.println(name.hashCode());
        System.out.println(name.split("")); // it converts it into String[] str = 
        System.out.println(name.toCharArray());
        char str[] = new char[]{'a','b','c','d'};
        System.out.println(str);
        System.out.println(name.charAt(0));
        System.out.println(name.compareTo("vivek"));
        System.out.println(name.compareToIgnoreCase("Vivek"));
        System.out.println(name.replace('v', 'l'));
        System.out.println(name.replaceAll("viv", "v"));
        System.out.println(name.repeat(2));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("v"));
        System.out.println(name.startsWith("ek"));
        System.out.println(name.indexOf('v'));
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());
        System.out.println(name.contains("viv"));
        System.out.println(name.trim());

    }
}
