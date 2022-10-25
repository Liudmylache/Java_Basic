package lesson2.classwork;

public class Car {

    public String color;
    public int maxSpeed;

    public Car(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String toString(String color) {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String toString(String color, int maxSpeed) {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public void print(){
        System.out.println("print");
    }



    public static void main(String[] args) {

        Car car1 = new Car("Red", 220);
        Car car2 = new Car("White", 180);
        Car car3 = new Car("Blue", 250);
        Car car4 = new Car();

        System.out.println(car1.toString());
        System.out.println(car2.toString("Black"));
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        car4.print();

    }
}
