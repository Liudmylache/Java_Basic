package lesson6.classwork.shapes;

public class Circle extends Shape {

    public Circle() {

    }

    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw circle");
    }
}
