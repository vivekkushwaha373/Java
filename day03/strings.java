public class strings {
    public static void main(String[] args) {

        String s = "  Hello World  ";
        String a = "Java";
        String b = "java";

        // length
        System.out.println("length: " + s.length());

        // charAt
        System.out.println("charAt(1): " + s.charAt(1));

        // toCharArray
        char[] chars = s.toCharArray();
        System.out.println("toCharArray: " + java.util.Arrays.toString(chars));

        // substring
        System.out.println("substring(2,7): '" + s.substring(2, 7) + "'");

        // split
        String[] parts = "one,two,three".split(",");
        System.out.println("split: " + java.util.Arrays.toString(parts));

        // indexOf
        System.out.println("indexOf('o'): " + s.indexOf('o'));

        // lastIndexOf
        System.out.println("lastIndexOf('o'): " + s.lastIndexOf('o'));

        // contains
        System.out.println("contains(\"World\"): " + s.contains("World"));

        // equals
        System.out.println("equals(\"java\"): " + a.equals("java"));

        // equalsIgnoreCase
        System.out.println("equalsIgnoreCase(java): " + a.equalsIgnoreCase("JAVA"));

        // compareTo
        System.out.println("compareTo(java): " + a.compareTo(b));

        // startsWith / endsWith
        System.out.println("starts with \"  He\": " + s.startsWith("  He"));
        System.out.println("ends with \"d  \": " + s.endsWith("d  "));

        // toLowerCase / toUpperCase
        System.out.println("toLowerCase: " + s.toLowerCase());
        System.out.println("toUpperCase: " + s.toUpperCase());

        // trim
        System.out.println("trim: '" + s.trim() + "'");

        // replace
        System.out.println("replace('l', 'X'): " + s.replace('l', 'X'));

        // replaceAll (regex)
        System.out.println("replaceAll(\\\\s+, -): " + s.replaceAll("\\s+", "-"));

        // matches (regex)
        System.out.println("matches(.*World.*): " + s.matches(".*World.*"));

        // isEmpty / isBlank
        System.out.println("isEmpty: " + "".isEmpty());
        System.out.println("isBlank: " + "   ".isBlank());

        // join (static)
        System.out.println("join: " + String.join(" - ", "A", "B", "C"));

        // valueOf (static)
        System.out.println("valueOf(42): " + String.valueOf(42));

        // format (static)
        System.out.println("format: " + String.format("My name is %s and I'm %d", "Vivek", 25));

        // intern
        String x = new String("hello");
        String y = "hello";
        System.out.println("intern: " + (x.intern() == y));
    }
}