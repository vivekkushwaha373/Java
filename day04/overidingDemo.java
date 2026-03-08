
class Shape{
    void draw(){
       System.out.println("This is shape");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("This is circle");
    }
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("This is Rectangle");
    }
}
public class overidingDemo {
public static void main(String[] args) {
    Shape shape1 = new Shape();
    shape1.draw();
    Circle circle1 = new Circle();
    circle1.draw();
    Rectangle rectangle1 = new Rectangle();
    rectangle1.draw();
    Shape shape2 = new Rectangle();
    shape2.draw();
    
}
    
}
