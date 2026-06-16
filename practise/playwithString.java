package practise;

public class playwithString {
    public static void main(String[] args) {
        String name = "vivek";
        System.out.println(name);
        System.out.println(name.substring(0,3));
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.replace('v','i'));
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" helloji"));
        System.out.println(name.compareTo("vivek"));
        System.out.println(name.compareToIgnoreCase("Vivek"));
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());
        System.out.println(name.indexOf('v'));
        System.out.println(name.repeat(2));
        System.out.println(name.replaceAll(name, "lovebabber"));
        System.out.println(name.startsWith("viv"));
        System.out.println(name.endsWith("ek"));
        System.out.println(name.contains("viv"));
        System.out.println(name.toCharArray()[0]);
        System.out.println(name.trim());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        // System.out.println(name.replace());

        
        int num = 2;
        String n = String.valueOf(num); // this will also work however it internally implements what ?? -- > ans is Integer.toString()
        System.out.println(n); 
     
    }
}
