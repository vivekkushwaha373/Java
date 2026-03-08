package day10;

public record MathDemo() {
    public static void main(String[] args) {
        System.out.println(Math.min(1,2));
        System.out.println(Math.round(1.234487879));
        System.out.println(Math.ceil(2.4567));
        System.out.println(Math.pow(2,3));
        System.out.println((int)(Math.random()*11));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(25));
        System.out.println(Math.nextAfter(1,2));
    }
}
