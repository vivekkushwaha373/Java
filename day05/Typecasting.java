class Typecasting {
    public static void main(String[] args) {
        int a =4;
        System.out.println(a);
        double b = a; //implicit type casting
        double j = 5.98;
        System.out.println(b);
        int c= (int) j; //explicit typecasting this is also called type narrowing
        System.out.println(c);
    }
}