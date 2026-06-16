package practise;


// note string literal and is always immutable however with stringbuilder we can make is multaible witout creating new memory or 
// new object
public class moreonstring {
   public static void main(String[] args) {
       StringBuffer str = new StringBuffer("hello ji this is lovebabber");
       System.out.println(str);
       System.out.println(str.append("my is khan"));
       System.out.println(str);
       System.out.println(str.replace(0, 3, "hii"));
       str.setLength(10);
       System.out.println(str);
       System.out.println(str.capacity());
       System.out.println(str.length());
       System.out.println(str.hashCode());
       System.out.println(str.reverse());
       System.out.println(str.repeat("t", 2));
       System.out.println(str.insert(2,"o"));
       str.setCharAt(2, 'k');
       System.out.println(str);

   }   
}
