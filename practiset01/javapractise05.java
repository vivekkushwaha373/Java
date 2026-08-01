package practiset01;

public class javapractise05 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("vivek");
        str.append("null");
        System.out.println(str);
        str.setLength(4);
        System.out.println(str);
        str.ensureCapacity(8);
        System.out.println(str);
        System.out.println(str.capacity());
        System.out.println(str.delete(0, 2));
        System.out.println(str.insert(0, 'g'));
        System.out.println(str.toString());
        System.out.println(str.charAt(0));
        System.out.println(str.reverse());
        str.trimToSize();
        System.out.println(str.deleteCharAt(0));
        System.out.println(str.capacity());

        
    }   
}
