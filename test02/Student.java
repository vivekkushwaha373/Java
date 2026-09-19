package test02;

public class Student {
    public static void main(String[] args) {
        Address ad = new Address("Rapti Nagar", 273003);
        ImmutableClass cls = new ImmutableClass("vivek", 23,ad);
        System.out.println(cls.getName());
        System.out.println(cls.getAge());

        Address address = cls.getAddress();
        address.name="hanuman ji";
        address.pincode=234567;
        System.out.println(cls.getAddress());

        // System.out.println(cls.getAddress());
    }   
}
